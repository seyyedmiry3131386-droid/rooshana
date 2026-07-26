package defpackage;

import android.text.Layout;
import androidx.compose.ui.node.i;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke0 implements dp2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ke0(long j, float[] fArr, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        this.b = j;
        this.c = fArr;
        this.d = ref$IntRef;
        this.e = ref$FloatRef;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        float[] fArr;
        long j;
        yg ygVar;
        int i;
        float fA;
        float fA2;
        switch (this.a) {
            case 0:
                sy6 sy6Var = (sy6) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                long j2 = this.b;
                tc0 tc0Var = (tc0) this.e;
                i iVar = (i) obj;
                iVar.a();
                float f = sy6Var.a;
                float f2 = sy6Var.b;
                vm0 vm0Var = iVar.a;
                ((nm5) vm0Var.b.b).z(f, f2);
                try {
                    o40.h(iVar, (og) ref$ObjectRef.a, j2, 0L, 0.0f, tc0Var, 0, 890);
                } finally {
                    ((nm5) vm0Var.b.b).z(-f, -f2);
                }
                break;
            default:
                float[] fArr2 = (float[]) this.c;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.d;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.e;
                l16 l16Var = (l16) obj;
                int i2 = l16Var.b;
                yg ygVar2 = l16Var.a;
                int iF = l16Var.c;
                long j3 = this.b;
                int iG = i2 > zi8.g(j3) ? l16Var.b : zi8.g(j3);
                if (iF >= zi8.f(j3)) {
                    iF = zi8.f(j3);
                }
                long jB = uy6.b(l16Var.d(iG), l16Var.d(iF));
                int i3 = ref$IntRef.a;
                pi8 pi8Var = ygVar2.d;
                int iG2 = zi8.g(jB);
                int iF2 = zi8.f(jB);
                Layout layout = pi8Var.f;
                int length = layout.getText().length();
                if (iG2 < 0) {
                    sn3.a("startOffset must be > 0");
                }
                if (iG2 >= length) {
                    sn3.a("startOffset must be less than text length");
                }
                if (iF2 <= iG2) {
                    sn3.a("endOffset must be greater than startOffset");
                }
                if (iF2 > length) {
                    sn3.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i3 < (iF2 - iG2) * 4) {
                    sn3.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iG2);
                int lineForOffset2 = layout.getLineForOffset(iF2 - 1);
                rc3 rc3Var = new rc3(pi8Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int iF3 = pi8Var.f(lineForOffset);
                        int iMax = Math.max(iG2, lineStart);
                        int iMin = Math.min(iF2, iF3);
                        float fG = pi8Var.g(lineForOffset);
                        float fE = pi8Var.e(lineForOffset);
                        j = jB;
                        ygVar = ygVar2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fA3 = rc3Var.a(iMax, false, false, false);
                                    i = iMin;
                                    fA = rc3Var.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = rc3Var.a(iMax, false, false, false);
                                        fA2 = rc3Var.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = rc3Var.a(iMax, false, false, true);
                                        fA = rc3Var.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i3] = fA;
                                fArr[i3 + 1] = fG;
                                fArr[i3 + 2] = fA2;
                                fArr[i3 + 3] = fE;
                                i3 += 4;
                                iMax++;
                                iMin = i;
                            } else {
                                fA = rc3Var.a(iMax, z, z, true);
                                i = iMin;
                                fA2 = rc3Var.a(iMax + 1, true, true, true);
                            }
                            z = false;
                            fArr[i3] = fA;
                            fArr[i3 + 1] = fG;
                            fArr[i3 + 2] = fA2;
                            fArr[i3 + 3] = fE;
                            i3 += 4;
                            iMax++;
                            iMin = i;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            ygVar2 = ygVar;
                            fArr2 = fArr;
                            jB = j;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j = jB;
                    ygVar = ygVar2;
                }
                int iE = (zi8.e(j) * 4) + ref$IntRef.a;
                for (int i4 = ref$IntRef.a; i4 < iE; i4 += 4) {
                    int i5 = i4 + 1;
                    float f3 = fArr[i5];
                    float f4 = ref$FloatRef.a;
                    fArr[i5] = f3 + f4;
                    int i6 = i4 + 3;
                    fArr[i6] = fArr[i6] + f4;
                }
                ref$IntRef.a = iE;
                ref$FloatRef.a = ygVar.b() + ref$FloatRef.a;
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ ke0(sy6 sy6Var, Ref$ObjectRef ref$ObjectRef, long j, tc0 tc0Var) {
        this.c = sy6Var;
        this.d = ref$ObjectRef;
        this.b = j;
        this.e = tc0Var;
    }
}
