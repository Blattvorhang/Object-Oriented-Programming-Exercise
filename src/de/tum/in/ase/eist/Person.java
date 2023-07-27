package de.tum.in.ase.eist;

public abstract class Person {
	private final String name;
    private int age;
    private final String tumId;

    public Person(String name, int age, String tumId) {
        this.name = name;
        this.age = age;
        this.tumId = tumId;
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }

    public final String getTumId() {
        return tumId;
    }

    public final void say(String text) {
    	System.out.println(name + " said: " + text);
    }
}
