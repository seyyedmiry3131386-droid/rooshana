package androidx.compose.ui.layout;

import defpackage.a96;
import defpackage.ew;
import defpackage.ib7;
import defpackage.qp2;
import defpackage.sc3;
import defpackage.wy6;

/* JADX INFO: loaded from: classes.dex */
public final class d implements wy6 {
    public final wy6[] a;
    public final sc3 b;
    public final sc3 c;
    public final sc3 d;
    public final sc3 e;

    public d(wy6[] wy6VarArr) {
        this.a = wy6VarArr;
        int length = wy6VarArr.length;
        final sc3[] sc3VarArr = new sc3[length];
        for (int i = 0; i < length; i++) {
            sc3VarArr[i] = this.a[i].b();
        }
        this.b = new sc3(1, new qp2() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(ib7.d((a96) obj, true, sc3VarArr, ((Number) obj2).floatValue()));
            }
        });
        int length2 = this.a.length;
        final sc3[] sc3VarArr2 = new sc3[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            sc3VarArr2[i2] = this.a[i2].c();
        }
        this.c = new sc3(0, new qp2() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(ib7.d((a96) obj, true, sc3VarArr2, ((Number) obj2).floatValue()));
            }
        });
        int length3 = this.a.length;
        final sc3[] sc3VarArr3 = new sc3[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            sc3VarArr3[i3] = this.a[i3].d();
        }
        this.d = new sc3(1, new qp2() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(ib7.d((a96) obj, false, sc3VarArr3, ((Number) obj2).floatValue()));
            }
        });
        int length4 = this.a.length;
        final sc3[] sc3VarArr4 = new sc3[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            sc3VarArr4[i4] = this.a[i4].a();
        }
        this.e = new sc3(0, new qp2() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(ib7.d((a96) obj, false, sc3VarArr4, ((Number) obj2).floatValue()));
            }
        });
    }

    @Override // defpackage.wy6
    public final sc3 a() {
        return this.e;
    }

    @Override // defpackage.wy6
    public final sc3 b() {
        return this.b;
    }

    @Override // defpackage.wy6
    public final sc3 c() {
        return this.c;
    }

    @Override // defpackage.wy6
    public final sc3 d() {
        return this.d;
    }

    public final String toString() {
        return ew.O0(57, null, this.a);
    }
}
