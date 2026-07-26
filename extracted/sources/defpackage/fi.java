package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fi(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        switch (this.a) {
            case 0:
                ((ig8) this.b).d.invoke(((gi) this.c).a);
                break;
            default:
                aq3.q((Context) this.b, (TextClassification) this.c);
                break;
        }
        return true;
    }
}
