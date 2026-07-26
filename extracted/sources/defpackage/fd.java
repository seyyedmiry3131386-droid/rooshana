package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class fd implements AdapterView.OnItemClickListener {
    public final /* synthetic */ jd a;
    public final /* synthetic */ gd b;

    public fd(gd gdVar, jd jdVar) {
        this.b = gdVar;
        this.a = jdVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        gd gdVar = this.b;
        DialogInterface.OnClickListener onClickListener = gdVar.l;
        jd jdVar = this.a;
        onClickListener.onClick(jdVar.b, i);
        if (gdVar.n) {
            return;
        }
        jdVar.b.dismiss();
    }
}
