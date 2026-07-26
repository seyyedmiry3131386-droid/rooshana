package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t89 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final ImageView v;
    public final TabLayout w;
    public final FrameLayout x;

    public t89(ea1 ea1Var, View view, ImageView imageView, TabLayout tabLayout, FrameLayout frameLayout) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = tabLayout;
        this.x = frameLayout;
    }
}
