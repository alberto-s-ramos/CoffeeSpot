package pt.iscte.afcsr.coffeespot;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

public class Heart {

    private static  final String TAG = "Heart";

    private static final DecelerateInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
    private static final AccelerateInterpolator ACCELERATE_INTERPOLATOR = new AccelerateInterpolator();
    public ImageView heartNotFav, heartRed;

    public Heart(ImageView heartNotFav, ImageView heartRed){
        this.heartNotFav=heartNotFav;
        this.heartRed=heartRed;
    }

    public void toggleLike(){
        AnimatorSet animatorSet = new AnimatorSet();

        if(heartRed.getVisibility() == View.VISIBLE){



            heartRed.setVisibility(View.GONE);
            heartNotFav.setVisibility(View.VISIBLE);


        }
        else if(heartRed.getVisibility() == View.GONE){


            heartRed.setVisibility(View.VISIBLE);
            heartNotFav.setVisibility(View.GONE);


        }
        animatorSet.start();
    }
}
