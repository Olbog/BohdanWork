package com.solvd.homework.Enums;

public enum Menu {

    Man(AutoModel.TRUCKMODEL, TruckModel.MAN),
    Volvo(AutoModel.TRUCKMODEL, TruckModel.VOLVO),
    Nissan(AutoModel.TRUCKMODEL, TruckModel.NISSAN),
    Renault(AutoModel.TRUCKMODEL, TruckModel.RENAULT),
    Mercedes(AutoModel.TRUCKMODEL, TruckModel.MERCEDES),
    Scania(AutoModel.TRUCKMODEL, TruckModel.SCANIA),
    Iveco(AutoModel.TRUCKMODEL, TruckModel.IVECO),
    Daf(AutoModel.TRUCKMODEL, TruckModel.DAF);



    private AutoModel autoModel;
    private TruckModel truckModel;

    Menu(AutoModel autoModel, TruckModel truckModel) {
        this.autoModel = autoModel;
        this.truckModel = truckModel;
    }

    public AutoModel getAutoModel(){
        return autoModel;
    }
    public TruckModel getTruckModel(){
        return truckModel;
    }

}
