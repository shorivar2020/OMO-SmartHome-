public Room newRoom(String Devices){
    Room room = new Room();
    FabriceDevice f = new FabriceDevice();
    for(int = 0; i < Devices.size(); i++){
        f.(Devices[i]);
        room.addDevice(f);
    }
    return room;
}