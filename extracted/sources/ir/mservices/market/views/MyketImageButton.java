package ir.mservices.market.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes3.dex */
public class MyketImageButton extends AppCompatImageView {
    public MyketImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setDisable(boolean z, Drawable drawable) {
        setFocusable(z);
        setFocusableInTouchMode(z);
        setBackground(drawable);
    }
}
