package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public int[] a;
    public ArrayList b;

    public final void a(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(i);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a) {
                this.b.remove(i);
            }
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a) {
                this.b.add(i, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
        }
        this.b.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
    }

    public final void b() {
        int[] iArr = this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.b = null;
    }

    public final void c(int i) {
        int[] iArr = this.a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void d(int i) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size)).a >= i) {
                    this.b.remove(size);
                }
            }
        }
        g(i);
    }

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e(int i, int i2, int i3) {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(i4);
            int i5 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b == i3 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.d)) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f(int i) {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a == i) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.a
            r1 = -1
            if (r0 != 0) goto L6
            goto L9
        L6:
            int r0 = r0.length
            if (r5 < r0) goto La
        L9:
            return r1
        La:
            java.util.ArrayList r0 = r4.b
            if (r0 != 0) goto L10
        Le:
            r0 = r1
            goto L46
        L10:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.f(r5)
            if (r0 == 0) goto L1b
            java.util.ArrayList r2 = r4.b
            r2.remove(r0)
        L1b:
            java.util.ArrayList r0 = r4.b
            int r0 = r0.size()
            r2 = 0
        L22:
            if (r2 >= r0) goto L34
            java.util.ArrayList r3 = r4.b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r3 = r3.a
            if (r3 < r5) goto L31
            goto L35
        L31:
            int r2 = r2 + 1
            goto L22
        L34:
            r2 = r1
        L35:
            if (r2 == r1) goto Le
            java.util.ArrayList r0 = r4.b
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r0
            java.util.ArrayList r3 = r4.b
            r3.remove(r2)
            int r0 = r0.a
        L46:
            if (r0 != r1) goto L52
            int[] r0 = r4.a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            int[] r5 = r4.a
            int r5 = r5.length
            return r5
        L52:
            int r0 = r0 + 1
            int[] r2 = r4.a
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r4.a
            java.util.Arrays.fill(r2, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q.g(int):int");
    }

    public final void h(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        c(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.a, i, i3, -1);
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            if (i4 >= i) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a = i4 + i2;
            }
        }
    }

    public final void i(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        c(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.a;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a = i4 - i2;
                }
            }
        }
    }
}
