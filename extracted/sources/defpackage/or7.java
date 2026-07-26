package defpackage;

import android.content.Context;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class or7 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ or7(bp2 bp2Var, dl5 dl5Var, String str, af6 af6Var, Context context, String str2, dp2 dp2Var, int i) {
        this.a = i;
        this.b = bp2Var;
        this.c = dl5Var;
        this.d = str;
        this.e = af6Var;
        this.f = context;
        this.g = str2;
        this.h = dp2Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                bp2 bp2Var = (bp2) this.b;
                dl5 dl5Var = (dl5) this.c;
                String str = (String) this.d;
                af6 af6Var = (af6) this.e;
                Context context = (Context) this.f;
                String str2 = (String) this.g;
                dp2 dp2Var = (dp2) this.h;
                bp2Var.invoke();
                SnapshotStateList snapshotStateList = af6Var.a.j;
                ArrayList arrayList = new ArrayList(wu0.V(snapshotStateList, 10));
                ListIterator listIterator = snapshotStateList.listIterator();
                while (true) {
                    rz2 rz2Var = (rz2) listIterator;
                    if (!rz2Var.hasNext()) {
                        dl5Var.a(new cr(new bf6(ml9.z(arrayList), str)));
                    } else {
                        db8 db8Var = (db8) rz2Var.next();
                        db8Var.getClass();
                        js3.p(context, "context");
                        String string = db8Var.b;
                        if (m88.T(string, ApplicationStateDto.STATE_NONE, true)) {
                            string = context.getString(ts6.player_subtitle_none);
                        }
                        js3.m(string);
                        arrayList.add(new nm7(string.equals(str2), string, new xv3(dp2Var, db8Var, 21)));
                    }
                    break;
                }
                break;
            case 1:
                bp2 bp2Var2 = (bp2) this.b;
                dl5 dl5Var2 = (dl5) this.c;
                String str3 = (String) this.d;
                af6 af6Var2 = (af6) this.e;
                Context context2 = (Context) this.f;
                String str4 = (String) this.g;
                dp2 dp2Var2 = (dp2) this.h;
                bp2Var2.invoke();
                List list = af6Var2.a.a;
                ArrayList arrayList2 = new ArrayList(wu0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    float f = ((wa6) it.next()).a;
                    arrayList2.add(new nm7(js3.i(wa6.a(f, context2), str4), wa6.a(f, context2), new jy(dp2Var2, f, 1)));
                }
                dl5Var2.a(new cr(new bf6(ml9.z(arrayList2), str3)));
                break;
            default:
                return new xd9((v48) this.b, (v48) this.c, (v48) this.d, (v48) this.g, (v48) this.e, (fu7) this.f, (v48) this.h);
        }
        return tx8.a;
    }

    public /* synthetic */ or7(rv6 rv6Var, rv6 rv6Var2, rv6 rv6Var3, rv6 rv6Var4, rv6 rv6Var5, i iVar, l lVar) {
        this.a = 2;
        this.b = rv6Var;
        this.c = rv6Var2;
        this.d = rv6Var3;
        this.g = rv6Var4;
        this.e = rv6Var5;
        this.f = iVar;
        this.h = lVar;
    }
}
