package defpackage;

import android.content.Context;
import androidx.compose.material3.n;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import ir.myket.player.ui.client.utils.extensions.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gy implements bp2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gy(bp2 bp2Var, dl5 dl5Var, String str, af6 af6Var, String str2, dp2 dp2Var) {
        this.g = bp2Var;
        this.d = dl5Var;
        this.e = str;
        this.c = af6Var;
        this.f = str2;
        this.b = dp2Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException, IOException {
        boolean z;
        switch (this.a) {
            case 0:
                dl5 dl5Var = (dl5) this.d;
                String str = (String) this.e;
                xc6 xc6Var = (xc6) this.g;
                Context context = (Context) this.c;
                String str2 = (String) this.f;
                dp2 dp2Var = (dp2) this.b;
                bl4.H("on", "player_settings", "movie_click");
                List list = xc6Var.a;
                ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    float f = ((wa6) it.next()).a;
                    arrayList.add(new nm7(js3.i(wa6.a(f, context), str2), wa6.a(f, context), new jy(dp2Var, f, 0)));
                }
                dl5Var.a(new cr(new bf6(ml9.z(arrayList), str)));
                break;
            case 1:
                ve6 ve6Var = (ve6) this.d;
                dp2 dp2Var2 = (dp2) this.b;
                Context context2 = (Context) this.c;
                n nVar = (n) this.e;
                e71 e71Var = (e71) this.f;
                bp2 bp2Var = (bp2) this.g;
                String lowerCase = ve6Var.b.name().toLowerCase(Locale.ROOT);
                js3.o(lowerCase, "toLowerCase(...)");
                th0.k(b.M(new Pair("on", xa7.c(xa7.c("player", lowerCase), "share"))), "movie_click");
                dp2Var2.invoke(new sd6(new jb6(context2, new iy(context2, 2))));
                a.a(nVar, e71Var, bp2Var, new v7(27));
                break;
            case 2:
                ad7 ad7Var = (ad7) this.d;
                td7 td7Var = (td7) this.f;
                fd7 fd7Var = (fd7) this.g;
                String str3 = (String) this.e;
                Object[] objArr = (Object[]) this.b;
                boolean z2 = true;
                if (ad7Var.b != fd7Var) {
                    ad7Var.b = fd7Var;
                    z = true;
                } else {
                    z = false;
                }
                if (js3.i(ad7Var.c, str3)) {
                    z2 = z;
                } else {
                    ad7Var.c = str3;
                }
                ad7Var.a = td7Var;
                ad7Var.d = this.c;
                ad7Var.e = objArr;
                ed7 ed7Var = ad7Var.f;
                if (ed7Var != null && z2) {
                    ((sk6) ed7Var).K();
                    ad7Var.f = null;
                    ad7Var.b();
                }
                return tx8.a;
            default:
                bp2 bp2Var2 = (bp2) this.g;
                dl5 dl5Var2 = (dl5) this.d;
                String str4 = (String) this.e;
                af6 af6Var = (af6) this.c;
                String str5 = (String) this.f;
                dp2 dp2Var3 = (dp2) this.b;
                bp2Var2.invoke();
                SnapshotStateList snapshotStateList = af6Var.a.k;
                ArrayList arrayList2 = new ArrayList(wu0.V(snapshotStateList, 10));
                ListIterator listIterator = snapshotStateList.listIterator();
                while (true) {
                    rz2 rz2Var = (rz2) listIterator;
                    if (!rz2Var.hasNext()) {
                        dl5Var2.a(new cr(new bf6(ml9.z(arrayList2), str4)));
                    } else {
                        s00 s00Var = (s00) rz2Var.next();
                        String str6 = s00Var.b;
                        arrayList2.add(new nm7(str6.equals(str5), str6, new xv3(dp2Var3, s00Var, 19)));
                    }
                    break;
                }
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ gy(dl5 dl5Var, String str, xc6 xc6Var, Context context, String str2, dp2 dp2Var) {
        this.d = dl5Var;
        this.e = str;
        this.g = xc6Var;
        this.c = context;
        this.f = str2;
        this.b = dp2Var;
    }

    public /* synthetic */ gy(ve6 ve6Var, dp2 dp2Var, Context context, n nVar, e71 e71Var, bp2 bp2Var) {
        this.d = ve6Var;
        this.b = dp2Var;
        this.c = context;
        this.e = nVar;
        this.f = e71Var;
        this.g = bp2Var;
    }

    public /* synthetic */ gy(ad7 ad7Var, td7 td7Var, fd7 fd7Var, String str, Object obj, Object[] objArr) {
        this.d = ad7Var;
        this.f = td7Var;
        this.g = fd7Var;
        this.e = str;
        this.c = obj;
        this.b = objArr;
    }
}
