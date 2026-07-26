package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.d;

/* JADX INFO: loaded from: classes3.dex */
public final class r69 extends ContextWrapper {
    public LayoutInflater a;
    public LayoutInflater b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r69(Context context, d dVar) {
        super(context);
        context.getClass();
        ry6 ry6Var = new ry6(7, this);
        this.a = null;
        dVar.getClass();
        dVar.U.a(ry6Var);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.b == null) {
            if (this.a == null) {
                this.a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.b = this.a.cloneInContext(this);
        }
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r69(LayoutInflater layoutInflater, d dVar) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        super(context);
        ry6 ry6Var = new ry6(7, this);
        this.a = layoutInflater;
        dVar.getClass();
        dVar.U.a(ry6Var);
    }
}
