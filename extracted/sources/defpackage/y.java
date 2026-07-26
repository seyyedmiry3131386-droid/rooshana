package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
import com.j256.ormlite.dao.Dao;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public Object a;
    public Object b;

    public y(Dao dao) {
        this.a = null;
        this.b = new ArrayList();
        this.a = dao;
    }

    public static float i(int i, int i2, int i3) {
        return at2.R((i - i2) / i3, 0.0f, 1.0f);
    }

    public void A(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.ImageView");
            copyOnWriteArraySet.remove("android.widget.ImageView");
        } else {
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
        }
    }

    public void B(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.TextView");
            copyOnWriteArraySet.remove("android.widget.TextView");
        } else {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
        }
    }

    public void C() {
        e();
        IntentFilter intentFilterF = f();
        if (intentFilterF.countActions() == 0) {
            return;
        }
        if (((in) this.a) == null) {
            this.a = new in(0, this);
        }
        ((ln) this.b).k.registerReceiver((in) this.a, intentFilterF);
    }

    public abstract void D();

    public abstract void E();

    public abstract void F();

    public void c(String str) {
        ((CopyOnWriteArraySet) this.a).add(str);
        ((CopyOnWriteArraySet) this.b).remove(str);
    }

    public abstract void d();

    public void e() {
        in inVar = (in) this.a;
        if (inVar != null) {
            try {
                ((ln) this.b).k.unregisterReceiver(inVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter f();

    public abstract int[] g(int i);

    public abstract int h();

    public MenuItem j(MenuItem menuItem) {
        if (!(menuItem instanceof bc8)) {
            return menuItem;
        }
        bc8 bc8Var = (bc8) menuItem;
        if (((fw7) this.b) == null) {
            this.b = new fw7(0);
        }
        MenuItem menuItem2 = (MenuItem) ((fw7) this.b).get(bc8Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        zt4 zt4Var = new zt4((Context) this.a, bc8Var);
        ((fw7) this.b).put(bc8Var, zt4Var);
        return zt4Var;
    }

    public int[] k(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public int l(int i, int i2) {
        int iN = n(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int iN2 = n(i5);
            i3 += iN2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = iN2;
            }
        }
        return i3 + iN > i2 ? i4 + 1 : i4;
    }

    public int m(int i, int i2) {
        int iN = n(i);
        if (iN == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int iN2 = n(i4);
            i3 += iN2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = iN2;
            }
        }
        if (iN + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    public abstract int n(int i);

    public String o() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        js3.V(ConfirmDTO.INPUT_TYPE_TEXT);
        throw null;
    }

    public void p() {
        ((SparseIntArray) this.a).clear();
    }

    public abstract void q();

    public void r(gb8 gb8Var, h32 h32Var, Object obj) {
        ArrayList arrayList = (ArrayList) this.b;
        t tVar = new t(this, gb8Var, h32Var, obj);
        tVar.b(new Void[0]);
        arrayList.add(tVar);
    }

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract void v();

    public abstract int[] w(int i);

    public abstract void x(s80 s80Var);

    public abstract void y();

    public void z(Object obj, gb8 gb8Var, h32 h32Var, Object obj2) {
        ArrayList arrayList = (ArrayList) this.b;
        v vVar = new v(this, gb8Var, h32Var, obj2, obj);
        vVar.b(new Void[0]);
        arrayList.add(vVar);
    }

    public y(Context context) {
        this.a = context;
    }

    public y(int i) {
        this.b = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.b).add(new mw1());
        }
    }

    public y(int i, boolean z) {
        switch (i) {
            case 4:
                this.a = new SparseIntArray();
                this.b = new SparseIntArray();
                break;
            case 5:
            default:
                this.b = new int[2];
                break;
            case 6:
                this.a = new ll4(0, this);
                break;
            case 7:
                this.a = new CopyOnWriteArraySet();
                this.b = new CopyOnWriteArraySet();
                break;
        }
    }

    public y(ln lnVar) {
        this.b = lnVar;
    }
}
