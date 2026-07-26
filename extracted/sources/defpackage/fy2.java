package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class fy2 extends k {
    public final /* synthetic */ int a;
    public final vc0 b;
    public final Serializable c;

    public fy2() {
        this.a = 1;
        this.b = new lm3();
        this.c = new ArrayList();
    }

    @Override // defpackage.k
    public void a(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // defpackage.k
    public void c() {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.io.Serializable r0 = r10.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
        L10:
            r3 = 0
            if (r1 < 0) goto L3c
            java.lang.Object r4 = r0.get(r1)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r5 = r4.length()
            r6 = r3
        L1e:
            r7 = -1
            if (r6 >= r5) goto L30
            char r8 = r4.charAt(r6)
            r9 = 32
            if (r8 == r9) goto L2d
            switch(r8) {
                case 9: goto L2d;
                case 10: goto L2d;
                case 11: goto L2d;
                case 12: goto L2d;
                case 13: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L31
        L2d:
            int r6 = r6 + 1
            goto L1e
        L30:
            r6 = r7
        L31:
            if (r6 != r7) goto L35
            r4 = r2
            goto L36
        L35:
            r4 = r3
        L36:
            if (r4 != 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + (-1)
            goto L10
        L3c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L41:
            int r5 = r1 + 1
            if (r3 >= r5) goto L56
            java.lang.Object r5 = r0.get(r3)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.append(r5)
            r5 = 10
            r4.append(r5)
            int r3 = r3 + 1
            goto L41
        L56:
            java.lang.String r0 = r4.toString()
            vc0 r1 = r10.b
            lm3 r1 = (defpackage.lm3) r1
            r1.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy2.c():void");
    }

    @Override // defpackage.k
    public final vc0 d() {
        switch (this.a) {
            case 0:
                return (ey2) this.b;
            default:
                return (lm3) this.b;
        }
    }

    @Override // defpackage.k
    public void f(xn3 xn3Var) {
        switch (this.a) {
            case 0:
                xn3Var.f((String) this.c, (ey2) this.b);
                break;
        }
    }

    @Override // defpackage.k
    public final wc0 g(yq1 yq1Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (yq1Var.g >= 4) {
                    return new wc0(-1, yq1Var.c + 4, false);
                }
                if (yq1Var.h) {
                    return wc0.a(yq1Var.e);
                }
                return null;
        }
    }

    public fy2(int i, String str) {
        this.a = 0;
        ey2 ey2Var = new ey2();
        this.b = ey2Var;
        ey2Var.f = i;
        this.c = str;
    }
}
