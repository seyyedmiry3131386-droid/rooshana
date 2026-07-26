package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class nn extends jy0 implements tm {
    public ln e;
    public final mn f;

    /* JADX WARN: Type inference failed for: r1v2, types: [mn] */
    public nn(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(xp6.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f = new cy3() { // from class: mn
            @Override // defpackage.cy3
            public final boolean t(KeyEvent keyEvent) {
                return this.a.f(keyEvent);
            }
        };
        zm zmVarE = e();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(xp6.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((ln) zmVarE).U = i;
        zmVarE.d();
    }

    @Override // defpackage.jy0, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        ln lnVar = (ln) e();
        lnVar.w();
        ((ViewGroup) lnVar.B.findViewById(R.id.content)).addView(view, layoutParams);
        lnVar.m.a(lnVar.l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ja1.m(this.f, getWindow().getDecorView(), this, keyEvent);
    }

    public final zm e() {
        if (this.e == null) {
            ym ymVar = zm.a;
            this.e = new ln(getContext(), getWindow(), this, this);
        }
        return this.e;
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        ln lnVar = (ln) e();
        lnVar.w();
        return lnVar.l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().a();
    }

    @Override // defpackage.jy0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        ln lnVar = (ln) e();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(lnVar.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(lnVar);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        e().d();
    }

    @Override // defpackage.jy0, android.app.Dialog
    public final void onStop() {
        super.onStop();
        ln lnVar = (ln) e();
        lnVar.B();
        zk8 zk8Var = lnVar.o;
        if (zk8Var != null) {
            zk8Var.k0(false);
        }
    }

    @Override // defpackage.jy0, android.app.Dialog
    public void setContentView(int i) {
        d();
        e().h(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().l(charSequence);
    }

    @Override // defpackage.jy0, android.app.Dialog
    public void setContentView(View view) {
        d();
        e().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().l(getContext().getString(i));
    }

    @Override // defpackage.jy0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().j(view, layoutParams);
    }
}
