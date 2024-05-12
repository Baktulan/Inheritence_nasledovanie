public class Java extends Course {
    private String methods;
    private String DataTypes;

    public Java(int price, int countOfParticipant) {
        super(price, countOfParticipant);
    }

    public Java(int price, int countOfParticipant, String methods, String dataTypes) {
        super(price, countOfParticipant);
        this.methods = methods;
        DataTypes = dataTypes;
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }

    public String getDataTypes() {
        return DataTypes;
    }

    public void setDataTypes(String dataTypes) {
        DataTypes = dataTypes;
    }

    @Override
    public String toString() {
        return "Java: " +
                "Methods: " + methods + "\n" +
                "DataTypes: " + DataTypes +"\n"+ super.toString();
    }
}
