package com.company;

public class SimlpeClass {

    Integer id;

    String objectName;

    SimlpeClass childClass;

    public SimlpeClass(Integer id, String objectName, SimlpeClass childClass) {
        this.id = id;
        this.objectName = objectName;
        this.childClass = childClass;
    }

    public SimlpeClass(Integer id, String objectName) {
        this.id = id;
        this.objectName = objectName;
    }

    public SimlpeClass(Integer id) {
        this.id = id;
    }

    public SimlpeClass() {
    }

    private Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    private SimlpeClass getChildClass() {
        return childClass;
    }

    private void setChildClass(SimlpeClass childClass) {
        this.childClass = childClass;
    }

    private String getObjectName() {
        return objectName;
    }

    private void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public void add(String objectName) {
        if (id == null) {
            id = 1;
            setObjectName(objectName);
        } else {
            Integer newId = 2;
            SimlpeClass newChildClass = getChildClass();
            SimlpeClass prevChildClass = new SimlpeClass();
            while (newChildClass != null) {
                ++newId;
                prevChildClass = newChildClass;
                newChildClass = newChildClass.getChildClass();
            }
            SimlpeClass childSimpleClass = new SimlpeClass(newId, objectName);
            if (getChildClass() == null){
                setChildClass(childSimpleClass);
            } else {
                prevChildClass.setChildClass(childSimpleClass);
            }
        }

    }


    public String getObject(Integer id){
        String objectName = getObjectName();
        int count = 1;
        if (id <= 0) {
            System.out.println("Unexpected id");
            return null;
        }
        SimlpeClass childClass = getChildClass();
        while (count < id){
            ++count;
            objectName = childClass.getObjectName();
            childClass = childClass.getChildClass();
        }
        return objectName;
    }


    public void delete(Integer id){
        int count = 1;
        if (id <= 0) {
            System.out.println("Unexpected id");
            return;
        }
        SimlpeClass childClass = getChildClass();
        SimlpeClass prevChildClass = new SimlpeClass();
        while (count < id){
            ++count;
            prevChildClass = childClass;
            childClass = childClass.getChildClass();
        }
        prevChildClass.setObjectName(null);

    }



}
