Program implementuje chytrou domácnost. 
Dům se staví krok za krokem. Ke každému domu přistavíme garáž s dopravou. Zařízení jsou rozmístěna v závislosti na typu místnosti. Počet pokojů a doprava je určena konfigurací.
V domě jsou rozmístěni lidé a zvířata. Někteří lidé jsou rozmístěni v místnostech se zařízeními a někteří jsou rozmístěni mezi transporty.
Události se konají v závislosti na místnosti.
Některá zařízení pracují autonomně v závislosti na strategii dne.
Zařízení mění stavy a mohou vyvolat události, pokud jsou rozbité nebo prázdné (chladnička).

Funkční požadavky
F1+	Proměnné jsou implementovány jako části domu - Plocha, Domov, Místnosti, Parkování, Zařízení
    Proměnné jako živé bytosti - člověk, zvíře
    Proměnné jako vozidla - auto, kolo, lyže
    [Area, Home, Rooms, Parking, Device, Human, Animal, Car, Bicycle, Ski]

F2+	Existují různé implementace stavu, které můžeme měnit během programu nebo které se mění v závislosti na událostech:
    Zařízení mohou nebo nemusí fungovat - work/stop(Devices) | functionality!=0 --> work. 
    U ledničky a mikrovlnky stav hledání něčeho uvnitř - SomethingIn(Microwave)(Fridge) | addSomethingIn.removeSomethingIn(Fridge)
    Pro sporák - použití - SomethingOn(Plate)
    Zařízení mají stav zapnuto a vypnuto - On/Off(Devices)

F3+	boolean deviceState: false-off/ true-on

F4+	Čítače pro výpočet spotřeby zdrojů zařízení:
    Electricity/Functionality/Water/Cost

F5+	Některá zařízení nebo živé bytosti mohou provádět události. Příklady:
    Human can work/stop Device --> on/off | Akce Eating in Kitchen --> Take food from fridge --> In frodge -1 food
F6+ Události jsou generovány přítomností osoby v určité lokalitě a jsou vybírány náhodně nebo podle vybrané lokality.   
    If Human in Kitchen -->Eating / If Human in Living Room --> Chilling/ If Human in Parking --> use Tranport
F7+	U zařízení, která fungují autonomně, se události generují v závislosti na strategii pro daný den. Záleží také  na stavu zařízení.
    Hot temperature --> Work Heater /Cold temperature --> Work Conditioning / 23:00 clock --> Sleeping/Illumination on
	Functionality = 0 --> Event Broken Device --> Find Documentaton --> If find - fix/ If not find minus money and fix
	Fridge have not food --> Human go Shoping.
F8+	Vygenerování reportů:
+	HouseConfigurationReport and HouseConfigurationReportDevice
+	EventReport: report eventů, kde grupujeme eventy podle typu, zdroje eventů a jejich cíle (jaká entita event odbavila)
+	ActivityAndUsageReport(ONLY PEOPLE)
+	ConsumptionReport
F9+	Functionality = 0 --> Event Broken Device --> Find Documentaton --> If find - fix/ If not find minus + fix (String documentation)
F10+  Lidé jsou náhodně přidělováni do místností. Polovina lidí je přidělena do místností pro akce. Polovina lidí je rozdělena do vozidel. Pokud počet osob převyšuje počet vozidel, osoba čeká.
    If human > transports --> Event Wait


Nefunkční požadavky
+	Není požadována autentizace ani autorizace
+	Aplikace může běžet pouze v jedné JVM
+	Aplikaci pište tak, aby byly dobře schované metody a proměnné, které nemají být dostupné ostatním třídám. Vygenerovný javadoc by měl mít co nejméně public metod a proměnných.
+	Reporty jsou generovány do textového souboru
+	Konfigurace domu nahrávána přímo z třídy

Vhodné design patterny
-	State machine
+	Iterator In RoomMaker for create device
+	Factory/Factory method - For make new device
+	Decorator/Composite - Composite - Home have struct of tree
+	Singleton - AreaMaker, Config can only one
+	Visitor/Observer/Listener - Observer - Human get notify by broken device and then fix it
-	Chain of responsibility
-	Partially persistent data structure
-	Object Pool
-	Lazy Initialization
+       Strategies - Strategy of time and temperature in home

Požadované výstupy
+   V wiki
+	Veřejné API - Javadoc vygenerovaný pro funkce, kterými uživatel pracuje s vaším software
+	Config - big/medium/small
