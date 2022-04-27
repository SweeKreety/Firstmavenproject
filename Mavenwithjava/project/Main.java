package project;

    public class Main {
        public static void main(String [] args)
        Employee emp= new Employee (1, "Rashila", "Patan", 9844659871, 29855.55);
        Gson gson= new Gsonbuilder().create();

    System.out.println(gson.toJson(emp));
    }



}
