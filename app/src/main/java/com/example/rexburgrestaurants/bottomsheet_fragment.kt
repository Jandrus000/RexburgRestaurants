package com.example.rexburgrestaurants

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class bottomsheet_fragment (val title : String?): BottomSheetDialogFragment() {
    private var titleText: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottomsheet_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var comment=""
        if(title == "Curry Pizza"){
            comment="Excellent pizza, full of wonderful flavor! While we waited for our order to be ready, they gave us free sweet rice pudding to enjoy. Amazing service. Going here was a simply lovely experience! We will definitely be returning."
        }
        if(title == "Blister's BBQ"){
            comment="Yep it is in the gas station! I think that actually adds to the atmosphere of this BBQ place. We ordered the turkey club, the cowgirl with brisket & turkey, and the brisket fries. The fries had great flavor on their own but the other ingredients added a nice flair to them. My daughter loved the baked beans as well. The real star was the smoked turkey!! I wish I would have ordered double turkey instead of brisket. The turkey was that good! Portions are great for the price and all in all it was a great little spot for lunch. The BBQ sauce is knock your socks off sweet so if that isn't your thing bring your own."
        }
        if(title == "Taqueria el Rancho"){
            comment="The food is delicious, at the very first moment I got into this restaurant I was feeling like if I was in a Mexico City taqueria! 100% recommended"
        }
        if(title == "Fresco Kitchen And Grill"){
            comment="Wowza, what a gem of a place! Stopped by for lunch on my way to Mesa Falls, and was blown away by the delicious pizza, homemade lemonades, and exceptional service! McKay was amazing and explained the lemonade flavors perfectly. He was super upbeat, attentive, and kind."
        }
        if(title == "Kainoa's Hawaiian Grill"){
            comment="Meat was so soft and had good flavor (very impressed!), but I think this entré as a whole just didn't jive with me. When I come back I'll try the spam combo or a wrap, and that might be better.\n" +
                    "It reminded me of a cookout I attended hosted by a family from Guam (apologies, but that's the closest experience I have) so it seems authentic to me!"
        }
        if(title == "Righteous Slice"){
            comment="Keep in mind it’s not a build your own, but they have a large variety of combo, as well as the classics. Dining in you kinda feel like you’re in a warehouse, but it’s tidy and cheerful. The pizza is definitely unique to other pizzas. The crust is a perfect combination of crispy and chewy, and the flavor would be amazing if not for the char on the crust (typical of real oven baked pizza). I personally didn’t like the sauce, but I like the concentrated, thicker sauces, whereas this is lighter and tastes like a fresh tomato (good for those who like tomatoes, not for me). Toppings stay on, the cheese is thick ( vs. the caked on commercial pizzas). It’s not my favorite place, but I can see why others would like it."
        }
        if(title == "Big Jud's"){
            comment="The burgers here can be massive, but I prefer to get the smaller burgers. The fries and tots here are really good as well. We come once or twice a year to enjoy these great burgers. The mushroom burger is top notch. The milkshakes are really good too."
        }
        if(title == "BYUI Crossroads Food Court"){
            comment="The gyros are probably the best thing in the cafeteria. Good, but the employees are extremely careful about not giving you more than 0.1 ounces of ingredients than you're supposed to have. Maybe chill out a little bit? Otherwise very nice"
        }
        if(title == "Red Rabbit Grill"){
            comment="Cool but overpriced. The atmosphere is great, so I would recommend for a date. Not a whole lot of seating, but plenty of parking.\n" +
                    "Ordered poutine, tasted good but not like the one I had in Canada. Good to share between two people. Then we got two burgers which tasted fine. Better than fast food, especially the bread.\n" +
                    "Overall the bill was \$44 for two people. If you're not on a tight budget it's a good place to go to."
        }
        if(title == "Gringo's Mexican Restaurant"){
            comment="My waitress Angie was amazing but the food was horrible. I used to eat here a lot growing up, and man has it gone down hill. Steak quesadilla had 2 little pieces of meat in each portion and was so soggy from sitting in grease. Salsa had no flavor either. Don’t waste your money or time here."
        }
        if(title == "Original Thai"){
            comment="We went 2 nights in a row while in town for an event. Food is phenomenal. Service was great. All around great place to eat. Will definitely go back.\n" +
                    "\n" +
                    "We ordered family style. 6 items for our table of 3 to share, different items each night. We were not disappointed with anything we ordered."
        }
        if(title == "Millhollow Restaurant"){
            comment="I really enjoyed the atmosphere,  the food was so good. My daughter's sandwich was huge! The Christmas decorations were so cute!"
        }
        if(title == "JB's"){
            comment="Not sure why the place only has a 3.something rating. Got myself the Stuffed French Toast Breakfast and it was epic! They've got salt, pepper, ketchup, and hot sauce so you can flavor your eggs and such. But the French Toast stood on its own - I'd compare it to Space Crepes but thicker.\n" +
                    "Place seems old and could use an update, but it adds to the country feel. The Halloween decorations were nice too."
        }
        if(title == "New Fong's"){
            comment="I love this place! Generous portions and the food always tastes good. Absolutely love the Chicken Almond Ding!\n" +
                    "I would like to see herbal tea options on the menu (The majority of people in Rexburg don't drink black or green tea). I would also like fried tofu as an option"
        }
        if(title == "Da Pineapple Grill"){
            comment="The tempura was great, the pork buns were fine, but I expected a bit more from the pineapple chicken.  I don’t recommend the pineapple chicken, but the pork and barbecue sauce were great and I will be going back for those.  Dinner takes awhile, but I have found that the longer the food takes, the higher the quality.  Americans are used to frozen prep food so we tend to complain about a bit of wait, not realizing that food made in the kitchen when you order it takes a lot longer."
        }
        if(title == "SodaVine"){
            comment="Just got home from Soda Vine and am very happy with my experience there! My wife and I had a deal for a buy one medium gelati and get a small for free. They were the best I've had in town, and I'm a fan of both snoasis and carry anne's. I would have been very pleased even if we had paid full price. Great taste, texture, and price."
        }
        if(title == "Applebee's Grill + Bar"){
            comment="For a mid range restaurant, this Applebee's excelled in all areas. Our server, JJ, was stellar.  Food was good. Everything was made to order. We had a large group of\n" +
                    "12 at 11am."
        }
        if(title == "The Hickory"){
            comment="Been here a few times when visiting from out-of-town and there is something for everyone.  From salads to burgers and sandwiches to slow cooked meats.  They have a great variety of sides to choose from and I have been pleased with what I have gotten each time we have been there.  They also have a great selection of virgin drinks: Italian sodas to flavored lemonades and other mixed juice/soda drinks."
        }
        if(title == "Casa De Ochoa"){
            comment="Worse than Jalisco's in Idaho Falls. The chips and salsa is a miss. Really cold inside. The staff is friendly. The burritos are a good size and very flavourful. I would say it's a pretty standard solid Mexican place."
        }
        if(title == "Five Guys"){
            comment="I came very early for my doordash pickup, but they were so understanding and kind about it. The management is very good. Their staff is also very efficient and friendly. My order was quick, accurate, fresh, and tasty as always. The portions are generous and this location is always kept clean. This is my favorite burger place in Rexburg. I recommend their little cheeseburger (1 patty), Cajun fries, and shakes :)"
        }




        super.onViewCreated(view, savedInstanceState)
        titleText = view.findViewById<TextView>(R.id.title)
        var contentText = view.findViewById<TextView>(R.id.content)
        titleText!!.text = title;
        contentText!!.text= comment;
    }
}

