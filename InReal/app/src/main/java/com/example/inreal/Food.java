package com.example.inreal;

import com.example.inreal.R;

public class Food extends CategoriesDrinksAndFoods{


    public static final Food[] foods = {
            new Food("Pizza Pepperoni", "American Pizza with hot chorizzo",
                    R.drawable.pizza),
            new Food("Lasagna", "Italian paste based on couple of meet sauce and milk sauce",
                    R.drawable.lasagna),
            new Food("Roll Set FilaVo", "Fresh fish with rice and cheese Filadelphia and also another roll with flying fish roe",
                    R.drawable.sushi_set_filava),
    };

    public Food(String name, String description, int imageId) {
        super(name, description, imageId);
    }


    public static Food[] getFoods() {
        return foods;
    }

}
