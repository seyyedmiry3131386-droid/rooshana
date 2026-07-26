package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public class kd {
    public final gd a;
    public final int b;

    public kd(Context context) {
        this(context, ld.g(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public ld create() {
        gd gdVar = this.a;
        ld ldVar = new ld(gdVar.a, this.b);
        View view = gdVar.e;
        jd jdVar = ldVar.g;
        if (view != null) {
            jdVar.v = view;
        } else {
            CharSequence charSequence = gdVar.d;
            if (charSequence != null) {
                jdVar.d = charSequence;
                TextView textView = jdVar.t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = gdVar.c;
            if (drawable != null) {
                jdVar.r = drawable;
                ImageView imageView = jdVar.s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    jdVar.s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = gdVar.f;
        if (charSequence2 != null) {
            jdVar.c(-1, charSequence2, gdVar.g);
        }
        CharSequence charSequence3 = gdVar.h;
        if (charSequence3 != null) {
            jdVar.c(-2, charSequence3, gdVar.i);
        }
        if (gdVar.k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) gdVar.b.inflate(jdVar.z, (ViewGroup) null);
            int i = gdVar.n ? jdVar.A : jdVar.B;
            Object obj = gdVar.k;
            ?? idVar = obj;
            if (obj == null) {
                idVar = new id(gdVar.a, i, R.id.text1, null);
            }
            jdVar.w = idVar;
            jdVar.x = gdVar.o;
            if (gdVar.l != null) {
                alertController$RecycleListView.setOnItemClickListener(new fd(gdVar, jdVar));
            }
            if (gdVar.n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            jdVar.e = alertController$RecycleListView;
        }
        View view2 = gdVar.m;
        if (view2 != null) {
            jdVar.f = view2;
            jdVar.g = false;
        }
        ldVar.setCancelable(true);
        ldVar.setCanceledOnTouchOutside(true);
        ldVar.setOnCancelListener(null);
        ldVar.setOnDismissListener(null);
        pt4 pt4Var = gdVar.j;
        if (pt4Var != null) {
            ldVar.setOnKeyListener(pt4Var);
        }
        return ldVar;
    }

    public Context getContext() {
        return this.a.a;
    }

    public kd setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        gd gdVar = this.a;
        gdVar.h = gdVar.a.getText(i);
        gdVar.i = onClickListener;
        return this;
    }

    public kd setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        gd gdVar = this.a;
        gdVar.f = gdVar.a.getText(i);
        gdVar.g = onClickListener;
        return this;
    }

    public kd setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public kd setView(View view) {
        this.a.m = view;
        return this;
    }

    public kd(Context context, int i) {
        this.a = new gd(new ContextThemeWrapper(context, ld.g(context, i)));
        this.b = i;
    }
}
