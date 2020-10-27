package pt.iscte.afcsr.coffeespot;


import android.os.Bundle;
import android.app.Fragment;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductsFragment extends android.app.Fragment {

    private ImageView mHeartRed;
    private ImageView mHeartNotFav;
    private GestureDetector mGestureDetector;
    private Heart mHeart;
    private ListView mListView;

    public ProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_products, container, false);


        mListView = (ListView) view.findViewById(R.id.listView);

        ArrayList<Card> list = new ArrayList<>();
        list.add(new Card("drawable://"+R.drawable.exampleprod1, "Coffee Latte"));
        list.add(new Card("drawable://"+R.drawable.exampleprod2, "Black Coffee"));
        list.add(new Card("drawable://"+R.drawable.exampleprod3, "Coffee Latte Light"));
        list.add(new Card("drawable://"+R.drawable.exampleprod4, "Coffee Latte"));
        list.add(new Card("drawable://"+R.drawable.exampleprod5, "Simply Coffee"));
        CustomListAdapter adapter = new CustomListAdapter(getActivity().getBaseContext(), R.layout.card_layout, list);
        mListView.setAdapter(adapter);


       // mHeartRed = (ImageView) view.findViewWithTag("likebutton_red");
        //mHeartNotFav = (ImageView) view.findViewWithTag("likebutton_not_fav");


        // mGestureDetector = new GestureDetector(getActivity(), new GestureListener());



        // mHeartRed.setVisibility(View.GONE);
        // mHeartNotFav.setVisibility(View.VISIBLE);

        //mHeart = new Heart(mHeartNotFav,mHeartRed);
        //toggle();

        return view;
    }


    // public void toggle(){
    //     mHeartRed.setOnTouchListener(new View.OnTouchListener() {
    //      @Override
    //      public boolean onTouch(View v, MotionEvent event) {
    //          return mGestureDetector.onTouchEvent(event);
    //      }
    //  });
    //  mHeartNotFav.setOnTouchListener(new View.OnTouchListener() {
    //      @Override
    //      public boolean onTouch(View v, MotionEvent event) {
    //          return mGestureDetector.onTouchEvent(event);
    //      }
    //  });
    //}

    //public class GestureListener extends GestureDetector.SimpleOnGestureListener{
    //  @Override
    //  public boolean onDown(MotionEvent e) {
    //      mHeart.toggleLike();
    //      return true;
    //  }

    //        @Override
    //  public boolean onDoubleTap(MotionEvent e) {
    //      return true;
    //  }
    //}



}
