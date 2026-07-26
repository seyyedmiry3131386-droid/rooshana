package defpackage;

import ir.mservices.market.version2.webapi.requestdto.DownloadUriChecksumRequestDto;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class js1 extends t0 {
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;
    public final /* synthetic */ bs1 i;
    public final /* synthetic */ DownloadUriChecksumRequestDto j;
    public final /* synthetic */ DownloadUriChecksumRequestDto k;
    public final /* synthetic */ DownloadUriChecksumRequestDto l;
    public final /* synthetic */ String m;
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ List q;
    public final /* synthetic */ ps1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js1(ps1 ps1Var, String str, int i, String str2, bs1 bs1Var, DownloadUriChecksumRequestDto downloadUriChecksumRequestDto, DownloadUriChecksumRequestDto downloadUriChecksumRequestDto2, DownloadUriChecksumRequestDto downloadUriChecksumRequestDto3, String str3, int i2, String str4, boolean z, ArrayList arrayList) {
        super(2);
        this.r = ps1Var;
        this.f = str;
        this.g = i;
        this.h = str2;
        this.i = bs1Var;
        this.j = downloadUriChecksumRequestDto;
        this.k = downloadUriChecksumRequestDto2;
        this.l = downloadUriChecksumRequestDto3;
        this.m = str3;
        this.n = i2;
        this.o = str4;
        this.p = z;
        this.q = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Type inference failed for: r0v2, types: [is1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(final defpackage.t0 r24, java.lang.Object[] r25) {
        /*
            r23 = this;
            r1 = r23
            r0 = r25
            java.lang.Void[] r0 = (java.lang.Void[]) r0
            is1 r0 = new is1
            java.lang.String r2 = r1.f
            int r3 = r1.g
            java.lang.String r4 = r1.h
            r5 = r24
            r0.<init>()
            r6 = r0
            u4 r0 = new u4
            r5 = 3
            bs1 r4 = r1.i
            r3 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            ps1 r3 = r1.r
            dr1 r4 = r3.l
            java.lang.Object r4 = r4.get()
            dp3 r4 = (defpackage.dp3) r4
            java.lang.Integer r9 = r4.p(r2)
            dr1 r4 = r3.l
            java.lang.Object r4 = r4.get()
            dp3 r4 = (defpackage.dp3) r4
            boolean r4 = r4.G(r2)
            java.lang.String r5 = ""
            if (r4 == 0) goto L4b
            dr1 r4 = r3.l
            java.lang.Object r4 = r4.get()
            dp3 r4 = (defpackage.dp3) r4
            java.lang.String r4 = r4.q(r2)
            r18 = r4
            goto L4d
        L4b:
            r18 = r5
        L4d:
            ir.mservices.market.version2.webapi.requestdto.DownloadUriRequestDto r7 = new ir.mservices.market.version2.webapi.requestdto.DownloadUriRequestDto
            r4 = 10
            int r8 = r1.n
            if (r8 == r4) goto L6d
            r4 = 20
            if (r8 == r4) goto L6a
            r4 = 30
            if (r8 == r4) goto L67
            r4 = 40
            if (r8 == r4) goto L63
            r14 = r5
            goto L70
        L63:
            java.lang.String r4 = "Split"
        L65:
            r14 = r4
            goto L70
        L67:
            java.lang.String r4 = "Patch"
            goto L65
        L6a:
            java.lang.String r4 = "Main"
            goto L65
        L6d:
            java.lang.String r4 = "App"
            goto L65
        L70:
            dr1 r4 = r3.l
            java.lang.Object r4 = r4.get()
            dp3 r4 = (defpackage.dp3) r4
            r4.getClass()
            java.lang.String r8 = ".m.m.free"
            java.lang.String r5 = r2.replace(r8, r5)
            android.content.pm.ApplicationInfo r4 = r4.l(r5)
            if (r4 == 0) goto L90
            java.lang.String[] r4 = r4.splitPublicSourceDirs
            if (r4 == 0) goto L90
            java.lang.String r4 = "split"
        L8d:
            r16 = r4
            goto L93
        L90:
            java.lang.String r4 = "normal"
            goto L8d
        L93:
            android.content.Context r4 = r3.e
            boolean r20 = defpackage.dp3.L(r4)
            java.lang.String r21 = defpackage.wq2.A()
            java.lang.String r22 = defpackage.wq2.I()
            int r8 = r1.g
            ir.mservices.market.version2.webapi.requestdto.DownloadUriChecksumRequestDto r10 = r1.j
            ir.mservices.market.version2.webapi.requestdto.DownloadUriChecksumRequestDto r11 = r1.k
            ir.mservices.market.version2.webapi.requestdto.DownloadUriChecksumRequestDto r12 = r1.l
            java.lang.String r13 = r1.m
            java.lang.String r15 = r1.o
            boolean r4 = r1.p
            java.util.List r5 = r1.q
            r17 = r4
            r19 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            ir.mservices.market.version2.services.c r3 = r3.k
            r3.r(r2, r7, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js1.o(t0, java.lang.Object[]):void");
    }
}
