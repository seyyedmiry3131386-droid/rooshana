package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class fo implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public fo(TextView textView, Typeface typeface, int i) {
        this.c = textView;
        this.d = typeface;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        View view = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((TextView) view).setTypeface((Typeface) obj, i2);
                break;
            default:
                int i3 = BottomSheetBehavior.G0;
                ((BottomSheetBehavior) obj).R(view, i2, false);
                break;
        }
    }

    public fo(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }
}
