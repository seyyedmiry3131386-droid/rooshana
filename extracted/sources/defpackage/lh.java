package defpackage;

import defpackage.a96;
import defpackage.b96;
import defpackage.br9;
import defpackage.tx8;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class lh implements cl4 {
    public static final lh b = new lh(0);
    public static final lh c = new lh(1);
    public static final lh d = new lh(2);
    public static final k7 e = new k7(26);
    public static final lh f = new lh(3);
    public static final lh g = new lh(4);
    public static final lh h = new lh(5);
    public final /* synthetic */ int a;

    public /* synthetic */ lh(int i) {
        this.a = i;
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int b(es3 es3Var, List list, int i) {
        int i2 = this.a;
        return bl4.c(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        switch (this.a) {
            case 0:
                int size = list.size();
                if (size == 0) {
                    return el4Var.D(0, 0, b.I(), new dp2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$1
                        @Override // defpackage.dp2
                        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return tx8.a;
                        }
                    });
                }
                if (size == 1) {
                    final b96 b96VarT = ((yk4) list.get(0)).t(j);
                    return el4Var.D(b96VarT.a, b96VarT.b, b.I(), new dp2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$2
                        {
                            super(1);
                        }

                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            a96.j((a96) obj, b96VarT, 0, 0);
                            return tx8.a;
                        }
                    });
                }
                final ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    b96 b96VarT2 = ((yk4) list.get(i)).t(j);
                    iMax = Math.max(iMax, b96VarT2.a);
                    iMax2 = Math.max(iMax2, b96VarT2.b);
                    arrayList.add(b96VarT2);
                }
                return el4Var.D(iMax, iMax2, b.I(), new dp2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        a96 a96Var = (a96) obj;
                        ArrayList arrayList2 = arrayList;
                        int iY = br9.y(arrayList2);
                        if (iY >= 0) {
                            int i2 = 0;
                            while (true) {
                                a96.j(a96Var, (b96) arrayList2.get(i2), 0, 0);
                                if (i2 == iY) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        return tx8.a;
                    }
                });
            case 1:
                return el4Var.D(h31.j(j), h31.i(j), b.I(), new k7(26));
            case 2:
                return el4Var.D(h31.h(j), h31.g(j), b.I(), e);
            case 3:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i2 = 0; i2 < size3; i2++) {
                    b96 b96VarT3 = ((yk4) list.get(i2)).t(j);
                    iMax3 = Math.max(iMax3, b96VarT3.a);
                    iMax4 = Math.max(iMax4, b96VarT3.b);
                    arrayList2.add(b96VarT3);
                }
                return el4Var.D(iMax3, iMax4, b.I(), new a67(11, arrayList2));
            case 4:
                return el4Var.D(h31.f(j) ? h31.h(j) : 0, h31.e(j) ? h31.g(j) : 0, b.I(), new k7(26));
            default:
                return el4Var.D(h31.j(j), h31.i(j), b.I(), new k7(26));
        }
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int e(es3 es3Var, List list, int i) {
        int i2 = this.a;
        return bl4.e(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int g(es3 es3Var, List list, int i) {
        int i2 = this.a;
        return bl4.b(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int i(es3 es3Var, List list, int i) {
        int i2 = this.a;
        return bl4.d(this, es3Var, list, i);
    }
}
