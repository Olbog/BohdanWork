package com.solvd.homework.enums;

public enum AutoModel {
    TRUCKMODEL {
        public String getValue(){
            return "TRUCKMODEL ";
        }
    },
    MOTOMODEL {
        public String getValue(){
            return "MOTOMODEL ";
        }
    },
    SEDANMODEL {
        public String getValue(){
            return "SEDANMODEL ";
        }
    };
    private String value;

    public String getValue(){
        return value;
    }

}
enum TruckModel{

    VOLVO("Volvo"), NISSAN("Nissan"), RENAULT("Renault"), MAN("Man"), DAF("Daf"),
    SCANIA("Scania"), IVECO("Iveco"), MERCEDES("Mercedes");

    private String value;

    private TruckModel(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}