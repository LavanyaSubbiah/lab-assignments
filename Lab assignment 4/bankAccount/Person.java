/**
 * author Lavanya Subbiah
 * date 29/10/2020
 * desc Person class contains name and age of a person
 */
package LabAssignment4;

public class Person {

	/**
	 * declaring the variables
	 */
          private String name;
          private float age;
          /**
           * parameterised constructor
           * @param name
           * @param age
           */

          public Person(String name,float age) {
        	  super();
        	  this.name=name;
        	  this.age=age;
          }
          /**
           * getters and setters
           * @return
           */
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getAge() {
			return age;
		}

		public void setAge(float age) {
			this.age = age;
		}
          
	

}
