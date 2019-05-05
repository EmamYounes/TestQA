package com.example.smartec.testqa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.mindorks.placeholderview.Animation;
import com.mindorks.placeholderview.PlaceHolderView;
import com.mindorks.placeholderview.annotations.Animate;
import com.mindorks.placeholderview.annotations.Click;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.LongClick;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

/**
 * Created by Smartec on 3/11/2018.
 */

@Animate(Animation.ENTER_LEFT_DESC)
@NonReusable
@Layout(R.layout.gallery_item)
public class GalleryItem {
    Context mcontext;
    private PlaceHolderView mplaceHolderView;


    @View(R.id.imageView)
    private ImageView imageView;

    private Drawable mDrawable;

    public GalleryItem(Drawable drawable,Context context,PlaceHolderView placeHolderView) {
        mDrawable = drawable;
        mcontext=context;
        mplaceHolderView=placeHolderView;
    }

    @Resolve
    private void onResolved() {
        imageView.setImageDrawable(mDrawable);
    }

    @LongClick(R.id.container_id)

    private void onLongClick(){
        Toast.makeText(mcontext,"emam",Toast.LENGTH_LONG).show();
//        mplaceHolderView.removeView(this);
    }


}