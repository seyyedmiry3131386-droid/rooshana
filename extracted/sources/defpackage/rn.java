package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class rn {
    public final TextView a;
    public final pt2 b;

    public rn(TextView textView) {
        this.a = textView;
        this.b = new pt2(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((is3) this.b.b).p(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, lu6.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(lu6.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(lu6.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((is3) this.b.b).J(z);
    }

    public final void d(boolean z) {
        ((is3) this.b.b).K(z);
    }
}
