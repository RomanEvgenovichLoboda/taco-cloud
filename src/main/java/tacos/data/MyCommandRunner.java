//package tacos.data;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import tacos.Ingredient;
//
//@Component
//public class MyCommandRunner implements CommandLineRunner {
//    IngredientRepository repo;
//    MyCommandRunner(IngredientRepository repository){
//        this.repo = repository;
//    }
//    @Override
//    public void run(String... args) throws Exception {
//        repo.save(new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
//        repo.save(new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP));
//        repo.save(new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN));
//        repo.save(new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN));
//        repo.save(new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES));
//        repo.save(new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES));
//        repo.save(new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
//        repo.save(new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
//        repo.save(new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
//        repo.save(new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));
//    }
//}
