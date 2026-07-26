package defpackage;

import androidx.paging.LoadType;
import androidx.paging.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: classes.dex */
public final class hz5 {
    public final rz5 a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public final a g;
    public final a h;
    public final LinkedHashMap i;
    public final pa2 j;

    public hz5(rz5 rz5Var) {
        this.a = rz5Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.g = dt2.b(-1, 6, null);
        this.h = dt2.b(-1, 6, null);
        this.i = new LinkedHashMap();
        pa2 pa2Var = new pa2(23);
        pa2Var.B(LoadType.a, ha4.b);
        this.j = pa2Var;
    }

    public final e16 a(ha9 ha9Var) {
        Integer numValueOf;
        rz5 rz5Var = this.a;
        int i = rz5Var.a;
        ArrayList arrayList = this.c;
        List listP0 = kotlin.collections.a.P0(arrayList);
        if (ha9Var != null) {
            int i2 = ha9Var.e;
            int size = this.e;
            int i3 = -this.d;
            int iY = br9.y(arrayList) - this.d;
            int i4 = i3;
            while (i4 < i2) {
                size += i4 > iY ? i : ((z06) arrayList.get(this.d + i4)).a.size();
                i4++;
            }
            int i5 = size + ha9Var.f;
            if (i2 < i3) {
                i5 -= i;
            }
            numValueOf = Integer.valueOf(i5);
        } else {
            numValueOf = null;
        }
        return new e16(listP0, numValueOf, rz5Var, this.e);
    }

    public final boolean b(int i, LoadType loadType, z06 z06Var) {
        js3.p(loadType, "loadType");
        js3.p(z06Var, "page");
        int i2 = z06Var.d;
        List list = z06Var.a;
        int i3 = z06Var.e;
        int iOrdinal = loadType.ordinal();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (iOrdinal == 0) {
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            arrayList.add(z06Var);
            this.d = 0;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            this.f = i3;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            this.e = i2;
            return true;
        }
        LinkedHashMap linkedHashMap = this.i;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before append");
            }
            if (i == 0) {
                arrayList.add(z06Var);
                if (i3 == Integer.MIN_VALUE) {
                    int size = this.f - list.size();
                    i3 = size < 0 ? 0 : size;
                }
                this.f = i3 != Integer.MIN_VALUE ? i3 : 0;
                linkedHashMap.remove(LoadType.c);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                throw new IllegalStateException("should've received an init before prepend");
            }
            if (i == 0) {
                arrayList.add(0, z06Var);
                this.d++;
                if (i2 == Integer.MIN_VALUE) {
                    int size2 = this.e - list.size();
                    i2 = size2 < 0 ? 0 : size2;
                }
                this.e = i2 != Integer.MIN_VALUE ? i2 : 0;
                linkedHashMap.remove(LoadType.b);
                return true;
            }
        }
        return false;
    }

    public final i c(z06 z06Var, LoadType loadType) {
        js3.p(z06Var, "<this>");
        int iOrdinal = loadType.ordinal();
        int size = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                size = 0 - this.d;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                size = (this.c.size() - this.d) - 1;
            }
        }
        List listB = br9.B(new mq8(size, z06Var.a));
        int iOrdinal2 = loadType.ordinal();
        pa2 pa2Var = this.j;
        if (iOrdinal2 == 0) {
            i iVar = i.g;
            return ml9.d(listB, this.e, this.f, pa2Var.D(), null);
        }
        if (iOrdinal2 == 1) {
            i iVar2 = i.g;
            return new i(LoadType.b, listB, this.e, -1, pa2Var.D(), null);
        }
        if (iOrdinal2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        i iVar3 = i.g;
        return new i(LoadType.c, listB, -1, this.f, pa2Var.D(), null);
    }
}
