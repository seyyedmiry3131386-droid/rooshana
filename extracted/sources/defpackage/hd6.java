package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: classes.dex */
public final class hd6 extends o {
    public final TextView u;
    public final TextView v;
    public final ImageView w;
    public final /* synthetic */ PlayerControlView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd6(PlayerControlView playerControlView, View view) {
        super(view);
        this.x = playerControlView;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(ir6.exo_main_text);
        this.v = (TextView) view.findViewById(ir6.exo_sub_text);
        this.w = (ImageView) view.findViewById(ir6.exo_icon);
        view.setOnClickListener(new cd(23, this));
    }
}
