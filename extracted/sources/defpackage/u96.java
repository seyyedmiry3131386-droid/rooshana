package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.e;

/* JADX INFO: loaded from: classes.dex */
public final class u96 implements s96, fa6 {
    public static final u96 b = new u96(0);
    public static final u96 c = new u96(1);
    public static final u96 d = new u96(2);
    public final /* synthetic */ int a;

    public /* synthetic */ u96(int i) {
        this.a = i;
    }

    public static String c(TextClassification textClassification, qz0 qz0Var) {
        qz0Var.a0(950061013);
        String strValueOf = String.valueOf(textClassification.getLabel());
        qz0Var.q(false);
        return strValueOf;
    }

    public static void d(RemoteAction remoteAction) {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            i3.v(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static String f(RemoteAction remoteAction, qz0 qz0Var) {
        qz0Var.a0(-1376593684);
        String string = remoteAction.getTitle().toString();
        qz0Var.q(false);
        return string;
    }

    public static Typeface j(String str, fj2 fj2Var, int i) {
        if (i == 0 && js3.i(fj2Var, fj2.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), fj2Var.a, i == 1);
    }

    public static void k(b51 b51Var, Context context, ng8 ng8Var) {
        if (context == null) {
            return;
        }
        int i = ng8Var.c;
        TextClassification textClassification = ng8Var.b;
        if (i < 0) {
            g8 g8Var = new g8(29, textClassification);
            Drawable icon = textClassification.getIcon();
            b51.b(b51Var, g8Var, icon != null ? new a(-1123224187, new nh1(3, icon), true) : null, new xv3(context, textClassification, 24), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            b51.b(b51Var, new fg8(0, remoteAction), ((i == 0) || remoteAction.shouldShowIcon()) ? new a(-1261173016, new hg8(remoteAction), true) : null, new yu7(4, remoteAction), 6);
        }
    }

    @Override // defpackage.s96
    public boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.s96
    public r96 b(View view, qj1 qj1Var) {
        switch (this.a) {
            case 0:
                return new t96(new Magnifier(view));
            default:
                return new v96(new Magnifier(view));
        }
    }

    @Override // defpackage.fa6
    public Typeface e(fj2 fj2Var, int i) {
        return j(null, fj2Var, i);
    }

    public void g(Drawable drawable, qz0 qz0Var, int i) {
        qz0Var.c0(257732500);
        int i2 = (qz0Var.h(drawable) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 3) != 2)) {
            hx4 hx4VarI = b.i(ex4.b, c51.j);
            boolean zH = qz0Var.h(drawable);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new a67(20, drawable);
                qz0Var.l0(objM);
            }
            bg0.a(wn5.A(hx4VarI, (dp2) objM), qz0Var, 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new iz(this, drawable, i, 20);
        }
    }

    public void h(final Icon icon, qz0 qz0Var, final int i) {
        my6 my6VarS;
        qp2 qp2Var;
        qz0Var.c0(2116504409);
        int i2 = (qz0Var.h(icon) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) qz0Var.j(e.b);
            boolean zF = qz0Var.f(icon) | qz0Var.f(context);
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                objM = icon.loadDrawable(context);
                qz0Var.l0(objM);
            }
            Drawable drawable = (Drawable) objM;
            if (drawable == null) {
                my6VarS = qz0Var.s();
                if (my6VarS != null) {
                    final int i3 = 0;
                    qp2Var = new qp2(this, icon, i, i3) { // from class: gg8
                        public final /* synthetic */ int a;
                        public final /* synthetic */ u96 b;
                        public final /* synthetic */ Icon c;

                        {
                            this.a = i3;
                            this.b = this;
                        }

                        @Override // defpackage.qp2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            qz0 qz0Var2 = (qz0) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    this.b.h(this.c, qz0Var2, hs9.W(49));
                                    break;
                                default:
                                    this.b.h(this.c, qz0Var2, hs9.W(49));
                                    break;
                            }
                            return tx8.a;
                        }
                    };
                    my6VarS.d = qp2Var;
                }
                return;
            }
            g(drawable, qz0Var, 48);
        } else {
            qz0Var.U();
        }
        my6VarS = qz0Var.s();
        if (my6VarS != null) {
            final int i4 = 1;
            qp2Var = new qp2(this, icon, i, i4) { // from class: gg8
                public final /* synthetic */ int a;
                public final /* synthetic */ u96 b;
                public final /* synthetic */ Icon c;

                {
                    this.a = i4;
                    this.b = this;
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    qz0 qz0Var2 = (qz0) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            this.b.h(this.c, qz0Var2, hs9.W(49));
                            break;
                        default:
                            this.b.h(this.c, qz0Var2, hs9.W(49));
                            break;
                    }
                    return tx8.a;
                }
            };
            my6VarS.d = qp2Var;
        }
    }

    @Override // defpackage.fa6
    public Typeface i(lr2 lr2Var, fj2 fj2Var, int i) {
        return j(lr2Var.c, fj2Var, i);
    }
}
