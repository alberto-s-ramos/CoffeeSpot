package pt.iscte.afcsr.coffeespot;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class Card {

    private Context context;
    private String imageURL;
    private String title;
    private ImageView notfav;
    private ImageView fav;
    private GestureDetector mGestureDetector;
    private Heart mHeart;


    public Card(String imageURL, String title){
        this.imageURL=imageURL;
        this.title=title;
    }





    public String getImageURL() {
        return imageURL;
    }


    public String getTitle() {

        return title;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public ImageView getNotfav() {
        return notfav;
    }

    public ImageView getFav() {
        return fav;
    }

    public void setNotfav(ImageView notfav) {
        this.notfav = notfav;
    }

    public void setFav(ImageView fav) {
        this.fav = fav;
    }
}
