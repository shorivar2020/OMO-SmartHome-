
Funkční požadavky
F1+	Area, Home, Rooms, Parking, Device, HomeAI, Human, Animal, Car, Bicycle
F2+	work/stop(Devices) | SomethingIn(Microwave)(Fridge)/SomethingOn(Plate) | On/Off(Devices) | functionality!=0 --> work. | addSomethingIn/removeSomethingIn(Fridge)
F3+	boolean deviceState: false-off/ true-on
F4+	Electricity/Functionality/Water/Cost
F5+	Human can work/stop Device --> on/off | Akce Eating in Kitchen --> Take food from fridge --> In frodge -1 food
F6+	If Human in Kitchen -->Eating / If Human in Living Room --> Chilling/ If Human in Parking --> use Tranport
F7+	Hot temperature --> Work Heater /Cold temperature --> Work Conditioning / 23:00 clock --> Sleeping/Illumination on
⦁	Functionality = 0 --> Event Broken Device --> Find Documentaton --> If find - fix/ If not find minus money and fix
⦁	Fridge have not food --> Human go Shoping.
F8+	Vygenerování reportů:
+	HouseConfigurationReport and HouseConfigurationReportDevice
+	EventReport: report eventů, kde grupujeme eventy podle typu, zdroje eventů a jejich cíle (jaká entita event odbavila)
+	ActivityAndUsageReport(ONLY PEOPLE)
+	ConsumptionReport
F9+	Functionality = 0 --> Event Broken Device --> Find Documentaton --> If find - fix/ If not find minus + fix (String documentation)
F10+   Half of Human go to House and have Events with Device. Half of Human go to Parking and Use Transport. If human > transports --> Event Wait


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
+   Strategies - Strategy of time and temperature in home

Požadované výstupy
+	Design ve formě use case diagramů, class diagramů a stručného popisu jak chcete úlohu realizovat
+	Veřejné API - Javadoc vygenerovaný pro funkce, kterými uživatel pracuje s vaším software
+	Config - big/medium/small
