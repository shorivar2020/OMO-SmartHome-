
Funkční požadavky
+F1	Entity se kterými pracujeme - Maker.Area -- Maker.Room -- Devices -- Transport (Without window and floor)
F2	work()/stop() somethingIn;
F3	State int - 0/1/2
F4	electricity, functionallity, water (without gas)
F5	Jednotlivé osoby a zvířata mohou provádět aktivity(akce), které mají nějaký efekt na zařízení nebo jinou osobu.
    Např. Plynovy_kotel_1[oteverny_plyn] + Otec.zavritPlyn(plynovy_kotel_1) -> Plynovy_kotel_1[zavreny_plyn].
F6	Jednotlivá zařízení a osoby se v každém okamžiku vyskytují v jedné místnosti (pokud nesportují) a náhodně generují eventy (eventem může být důležitá informace a nebo alert)
F7	Eventy jsou přebírány a odbavovány vhodnou osobou (osobami) nebo zařízením (zařízeními). Např.:
-	čidlo na vítr (vítr) => vytažení venkovních žaluzií
-	jistič (výpadek elektřiny) => vypnutí všech nedůležitých spotřebičů (v provozu zůstávají pouze ty nutné)
-	čidlo na vlhkost (prasklá trubka na vodu) => máma -> zavolání hasičů, táta -> uzavření vody;dcera -> vylovení křečka
-   Miminko potřebuje přebalit => táta se skrývá, máma -> přebalení
-	Zařízení přestalo fungovat => …
-	V lednici došlo jídlo => ...
F8	Vygenerování reportů:
-	HouseConfigurationReport: veškerá konfigurační data domu zachovávající hieararchii - dům -> patro -> místnost -> okno -> žaluzie atd. Plus jací jsou obyvatelé domu.
-	EventReport: report eventů, kde grupujeme eventy podle typu, zdroje eventů a jejich cíle (jaká entita event odbavila)
-	ActivityAndUsageReport: Report akcí (aktivit) jednotlivých osob a zvířat, kolikrát které osoby použily které zařízení.
-	ConsumptionReport: Kolik jednotlivé spotřebiče spotřebovaly elektřiny, plynu, vody. Včetně finančního vyčíslení.
F9	Fix()
F10	Rodina je aktivní a volný čas tráví zhruba v poměru (50% používání spotřebičů v domě a 50% sport kdy používá sportovní náčiní kolo nebo lyže).
 Když není volné zařízení nebo sportovní náčiní, tak osoba čeká.

Nefunkční požadavky
⦁	Není požadována autentizace ani autorizace
⦁	Aplikace může běžet pouze v jedné JVM
⦁	Aplikaci pište tak, aby byly dobře schované metody a proměnné, které nemají být dostupné ostatním třídám.
Vygenerovný javadoc by měl mít co nejméně public metod a proměnných.
⦁	Reporty jsou generovány do textového souboru
⦁	Konfigurace domu, zařízení a obyvatel domu může být nahrávána přímo z třídy nebo externího souboru (preferován je json)

Vhodné design patterny
⦁	State machine
⦁	Iterator
⦁	Factory/Factory method --> Factory device
⦁	Decorator/Composite
⦁	Singleton
⦁	Visitor/Observer/Listener
⦁	Chain of responsibility
⦁	Partially persistent data structure
⦁	Object Pool
⦁	Lazy Initialization

Požadované výstupy
⦁	Design ve formě use case diagramů, class diagramů a stručného popisu jak chcete úlohu realizovat
⦁	Veřejné API - Javadoc vygenerovaný pro funkce, kterými uživatel pracuje s vaším software
⦁	Dvě různé konfigurace domu a pro ně vygenerovány reporty za různá období. Minimální konfigurace alespoň jednoho domu je:
 6 osob, 3 zvířata, 8 typů spotřebičů, 20 ks spotřebičů, 6 místností, jedny lyže, dvě kola.

