package com.learning.interfaceNotes.interfaceDefaultMethods;

 interface ParentFunInterfaceWithDefaultMethod {
     default void sayYourName(){
        System.out.println("Hello World, ParentFunInterfaceWithDefaultMethod");
    }

}


class child implements ParentFunInterfaceWithDefaultMethod{
    @Override
    public void sayYourName(){
        System.out.println("Hello World, Child");
    }
}


/*
* WIth the child overriding the default method, the child's method will be called
* else the interface method will be called
* */
class Main{
    public static void main(String[] args){
        child obj = new child();
//        child obj = new ParentFunInterfaceWithDefaultMethod(); this will throw an error as we cannot create instance of Interface
        obj.sayYourName();
    }
}