package athome.project.first.cat;

public class CatInfo {
    private String name;
    private double weight;
    private int age;
    private char neutral;
    
    public CatInfo() {}
    
    public CatInfo(String name, double weight, int age, char neutral) {
    	this.name = name;
    	this.weight = weight;
    	this.age = age;
    	this.neutral = neutral;
    }
    
    public String getName() {
    	return this.name;
    }
    public double getWeight() {
    	return this.weight;
    }
    public int getAge() {
    	return this.age;
    }
    public char getNeutral() {
    	return this.neutral;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setWeight(double weight) {
    	this.weight = weight;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public void setNeutral(char neutral) {
    	this.neutral = neutral;
    }
    
    
    
}
