package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import ir.mservices.market.movie.download.core.url.MovieDownloadUrlService;
import ir.mservices.market.receivers.PackageInstallationChangeReceiver;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.version2.manager.install.f;
import ir.mservices.market.version2.services.b;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.services.e;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class w91 implements el2, a8, lp7, ar2, wz8, do6, hw5, e79, my5, a68, ku, bf7, cf7 {
    public final on6 A;
    public final on6 A0;
    public final on6 A1;
    public final on6 A2;
    public final on6 B;
    public final on6 B0;
    public final on6 B1;
    public final on6 B2;
    public final on6 C;
    public final on6 C0;
    public final on6 C1;
    public final on6 C2;
    public final on6 D;
    public final on6 D0;
    public final on6 D1;
    public final on6 D2;
    public final on6 E;
    public final on6 E0;
    public final on6 E1;
    public final on6 E2;
    public final on6 F;
    public final on6 F0;
    public final on6 F1;
    public final on6 F2;
    public final on6 G;
    public final on6 G0;
    public final on6 G1;
    public final on6 G2;
    public final on6 H;
    public final on6 H0;
    public final on6 H1;
    public final si1 H2;
    public final on6 I;
    public final on6 I0;
    public final on6 I1;
    public final on6 I2;
    public final on6 J;
    public final on6 J0;
    public final on6 J1;
    public final on6 J2;
    public final on6 K;
    public final on6 K0;
    public final on6 K1;
    public final on6 K2;
    public final si1 L;
    public final on6 L0;
    public final on6 L1;
    public final on6 L2;
    public final on6 M;
    public final on6 M0;
    public final on6 M1;
    public final on6 M2;
    public final on6 N;
    public final on6 N0;
    public final on6 N1;
    public final on6 N2;
    public final on6 O;
    public final on6 O0;
    public final on6 O1;
    public final on6 O2;
    public final on6 P;
    public final on6 P0;
    public final on6 P1;
    public final on6 P2;
    public final on6 Q;
    public final on6 Q0;
    public final on6 Q1;
    public final on6 Q2;
    public final on6 R;
    public final on6 R0;
    public final on6 R1;
    public final on6 R2;
    public final on6 S;
    public final on6 S0;
    public final on6 S1;
    public final on6 S2;
    public final si1 T;
    public final on6 T0;
    public final on6 T1;
    public final on6 T2;
    public final on6 U;
    public final on6 U0;
    public final on6 U1;
    public final on6 U2;
    public final on6 V;
    public final on6 V0;
    public final on6 V1;
    public final on6 V2;
    public final on6 W;
    public final on6 W0;
    public final on6 W1;
    public final on6 W2;
    public final on6 X;
    public final on6 X0;
    public final on6 X1;
    public final on6 X2;
    public final on6 Y;
    public final on6 Y0;
    public final on6 Y1;
    public final on6 Y2;
    public final on6 Z;
    public final on6 Z0;
    public final on6 Z1;
    public final on6 Z2;
    public final gu a;
    public final v91 a0;
    public final on6 a1;
    public final on6 a2;
    public final on6 a3;
    public final rl3 b;
    public final on6 b0;
    public final on6 b1;
    public final on6 b2;
    public final on6 b3;
    public final cv c;
    public final on6 c0;
    public final on6 c1;
    public final on6 c2;
    public final on6 c3;
    public final fv d;
    public final on6 d0;
    public final on6 d1;
    public final on6 d2;
    public final on6 d3;
    public final on6 e0;
    public final on6 e1;
    public final on6 e2;
    public final on6 f0;
    public final on6 f1;
    public final on6 f2;
    public final on6 g0;
    public final on6 g1;
    public final on6 g2;
    public final on6 h0;
    public final on6 h1;
    public final on6 h2;
    public final on6 i0;
    public final on6 i1;
    public final on6 i2;
    public final on6 j0;
    public final on6 j1;
    public final on6 j2;
    public final on6 k0;
    public final on6 k1;
    public final on6 k2;
    public final on6 l0;
    public final on6 l1;
    public final on6 l2;
    public final on6 m0;
    public final on6 m1;
    public final on6 m2;
    public final on6 n0;
    public final on6 n1;
    public final on6 n2;
    public final on6 o0;
    public final on6 o1;
    public final on6 o2;
    public final on6 p0;
    public final on6 p1;
    public final on6 p2;
    public final on6 q0;
    public final on6 q1;
    public final on6 q2;
    public final on6 r0;
    public final on6 r1;
    public final on6 r2;
    public final on6 s0;
    public final on6 s1;
    public final on6 s2;
    public final on6 t0;
    public final on6 t1;
    public final on6 t2;
    public final on6 u;
    public final on6 u0;
    public final on6 u1;
    public final on6 u2;
    public final si1 v;
    public final on6 v0;
    public final on6 v1;
    public final on6 v2;
    public final si1 w;
    public final on6 w0;
    public final on6 w1;
    public final on6 w2;
    public final on6 x;
    public final on6 x0;
    public final on6 x1;
    public final on6 x2;
    public final on6 y;
    public final on6 y0;
    public final on6 y1;
    public final on6 y2;
    public final si1 z;
    public final on6 z0;
    public final on6 z1;
    public final on6 z2;
    public final w91 e = this;
    public final on6 f = o40.t(this, 1);
    public final on6 g = o40.t(this, 3);
    public final on6 h = o40.t(this, 5);
    public final on6 i = o40.t(this, 4);
    public final on6 j = o40.t(this, 6);
    public final on6 k = o40.t(this, 12);
    public final on6 l = o40.t(this, 11);
    public final on6 m = o40.t(this, 13);
    public final on6 n = o40.t(this, 10);
    public final on6 o = o40.t(this, 9);
    public final on6 p = o40.t(this, 14);
    public final on6 q = o40.t(this, 16);
    public final on6 r = o40.t(this, 15);
    public final si1 s = new si1();
    public final on6 t = o40.t(this, 8);

    public w91(gu guVar, cv cvVar, fv fvVar, rl3 rl3Var) {
        this.a = guVar;
        this.b = rl3Var;
        this.c = cvVar;
        this.d = fvVar;
        si1.a(this.s, dr1.b(new v91(this, 7)));
        this.u = dr1.b(new v91(this, 17));
        this.v = new si1();
        this.w = new si1();
        this.x = o40.t(this, 21);
        this.y = o40.t(this, 23);
        this.z = new si1();
        this.A = o40.t(this, 25);
        this.B = dr1.b(new v91(this, 27));
        this.C = o40.t(this, 26);
        this.D = o40.t(this, 24);
        this.E = o40.t(this, 28);
        this.F = o40.t(this, 22);
        this.G = o40.t(this, 29);
        this.H = o40.t(this, 34);
        this.I = o40.t(this, 33);
        this.J = o40.t(this, 38);
        this.K = o40.t(this, 37);
        this.L = new si1();
        this.M = o40.t(this, 41);
        this.N = o40.t(this, 42);
        this.O = o40.t(this, 43);
        this.P = o40.t(this, 40);
        this.Q = o40.t(this, 45);
        this.R = o40.t(this, 44);
        si1.a(this.L, dr1.b(new v91(this, 39)));
        this.S = dr1.b(new v91(this, 36));
        this.T = new si1();
        this.U = o40.t(this, 47);
        this.V = o40.t(this, 46);
        this.W = o40.t(this, 35);
        this.X = o40.t(this, 32);
        this.Y = o40.t(this, 48);
        this.Z = o40.t(this, 31);
        this.a0 = new v91(this, 30);
        this.b0 = o40.t(this, 50);
        this.c0 = o40.t(this, 49);
        si1.a(this.T, dr1.b(new v91(this, 20)));
        this.d0 = dr1.b(new v91(this, 52));
        this.e0 = o40.t(this, 51);
        this.f0 = o40.t(this, 53);
        this.g0 = o40.t(this, 54);
        this.h0 = o40.t(this, 19);
        this.i0 = o40.t(this, 57);
        this.j0 = o40.t(this, 56);
        this.k0 = o40.t(this, 55);
        si1.a(this.z, dr1.b(new v91(this, 18)));
        this.l0 = dr1.b(new v91(this, 58));
        si1.a(this.w, dr1.b(new v91(this, 2)));
        si1.a(this.v, dr1.b(new v91(this, 0)));
        this.m0 = dr1.b(new v91(this, 59));
        this.n0 = o40.t(this, 60);
        this.o0 = o40.t(this, 64);
        this.p0 = o40.t(this, 63);
        this.q0 = o40.t(this, 62);
        this.r0 = o40.t(this, 65);
        this.s0 = o40.t(this, 66);
        this.t0 = o40.t(this, 67);
        this.u0 = o40.t(this, 69);
        this.v0 = o40.t(this, 68);
        this.w0 = o40.t(this, 70);
        this.x0 = o40.t(this, 61);
        this.y0 = o40.t(this, 71);
        this.z0 = o40.t(this, 73);
        this.A0 = o40.t(this, 72);
        this.B0 = o40.t(this, 74);
        this.C0 = o40.t(this, 75);
        this.D0 = o40.t(this, 76);
        this.E0 = o40.t(this, 77);
        this.F0 = o40.t(this, 78);
        this.G0 = o40.t(this, 79);
        this.H0 = o40.t(this, 80);
        this.I0 = o40.t(this, 81);
        this.J0 = o40.t(this, 82);
        this.K0 = o40.t(this, 84);
        this.L0 = o40.t(this, 87);
        this.M0 = o40.t(this, 86);
        this.N0 = o40.t(this, 85);
        this.O0 = o40.t(this, 89);
        this.P0 = o40.t(this, 88);
        this.Q0 = o40.t(this, 90);
        this.R0 = o40.t(this, 83);
        this.S0 = o40.t(this, 91);
        this.T0 = o40.t(this, 92);
        this.U0 = o40.t(this, 93);
        this.V0 = o40.t(this, 94);
        this.W0 = o40.t(this, 95);
        this.X0 = o40.t(this, 96);
        this.Y0 = o40.t(this, 97);
        this.Z0 = o40.t(this, 99);
        this.a1 = o40.t(this, 98);
        this.b1 = o40.t(this, 100);
        this.c1 = o40.t(this, 102);
        this.d1 = o40.t(this, 104);
        this.e1 = o40.t(this, 103);
        this.f1 = o40.t(this, 101);
        this.g1 = o40.t(this, 105);
        this.h1 = o40.t(this, 106);
        this.i1 = o40.t(this, 107);
        this.j1 = o40.t(this, 108);
        this.k1 = o40.t(this, 109);
        this.l1 = o40.t(this, 110);
        this.m1 = o40.t(this, 111);
        this.n1 = o40.t(this, 112);
        this.o1 = o40.t(this, 113);
        this.p1 = o40.t(this, 114);
        this.q1 = o40.t(this, 115);
        this.r1 = o40.t(this, 117);
        this.s1 = o40.t(this, 116);
        this.t1 = o40.t(this, 118);
        this.u1 = o40.t(this, 119);
        this.v1 = o40.t(this, 120);
        this.w1 = o40.t(this, 121);
        this.x1 = o40.t(this, 122);
        this.y1 = o40.t(this, 123);
        this.z1 = o40.t(this, 124);
        this.A1 = o40.t(this, 125);
        this.B1 = o40.t(this, 126);
        this.C1 = o40.t(this, 127);
        this.D1 = o40.t(this, 128);
        this.E1 = o40.t(this, 129);
        this.F1 = o40.t(this, 131);
        this.G1 = o40.t(this, 130);
        this.H1 = o40.t(this, 132);
        this.I1 = o40.t(this, 133);
        this.J1 = o40.t(this, 134);
        this.K1 = o40.t(this, 136);
        this.L1 = o40.t(this, 135);
        this.M1 = o40.t(this, 137);
        this.N1 = o40.t(this, 138);
        this.O1 = o40.t(this, 139);
        this.P1 = o40.t(this, 140);
        this.Q1 = o40.t(this, 141);
        this.R1 = o40.t(this, 142);
        this.S1 = o40.t(this, 143);
        this.T1 = o40.t(this, 144);
        this.U1 = o40.t(this, 145);
        this.V1 = o40.t(this, 146);
        this.W1 = o40.t(this, 148);
        this.X1 = o40.t(this, 147);
        this.Y1 = o40.t(this, 149);
        this.Z1 = o40.t(this, 151);
        this.a2 = o40.t(this, 150);
        this.b2 = o40.t(this, 152);
        this.c2 = o40.t(this, 153);
        this.d2 = o40.t(this, 154);
        this.e2 = o40.t(this, 157);
        this.f2 = o40.t(this, 156);
        this.g2 = o40.t(this, ModuleDescriptor.MODULE_VERSION);
        this.h2 = o40.t(this, 158);
        this.i2 = o40.t(this, 159);
        this.j2 = o40.t(this, 160);
        this.k2 = o40.t(this, 162);
        this.l2 = o40.t(this, 161);
        this.m2 = o40.t(this, 163);
        this.n2 = o40.t(this, 164);
        this.o2 = o40.t(this, 165);
        this.p2 = o40.t(this, 166);
        this.q2 = o40.t(this, 168);
        this.r2 = o40.t(this, 167);
        this.s2 = o40.t(this, 169);
        this.t2 = o40.t(this, 170);
        this.u2 = o40.t(this, 171);
        this.v2 = o40.t(this, 173);
        this.w2 = o40.t(this, 172);
        this.x2 = o40.t(this, 175);
        this.y2 = o40.t(this, 176);
        this.z2 = o40.t(this, 174);
        this.A2 = o40.t(this, 178);
        this.B2 = o40.t(this, 177);
        this.C2 = o40.t(this, 179);
        this.D2 = o40.t(this, 180);
        this.E2 = o40.t(this, 181);
        this.F2 = o40.t(this, 182);
        this.G2 = o40.t(this, 183);
        this.H2 = new si1();
        this.I2 = o40.t(this, 186);
        si1.a(this.H2, dr1.b(new v91(this, 185)));
        this.J2 = dr1.b(new v91(this, 184));
        this.K2 = o40.t(this, 187);
        this.L2 = o40.t(this, 189);
        this.M2 = o40.t(this, 188);
        this.N2 = o40.t(this, 191);
        this.O2 = o40.t(this, 190);
        this.P2 = o40.t(this, 192);
        this.Q2 = o40.t(this, 193);
        this.R2 = o40.t(this, 194);
        this.S2 = o40.t(this, 195);
        this.T2 = o40.t(this, 196);
        this.U2 = o40.t(this, 197);
        this.V2 = o40.t(this, 198);
        this.W2 = o40.t(this, 199);
        this.X2 = o40.t(this, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        this.Y2 = o40.t(this, 201);
        this.Z2 = o40.t(this, 202);
        this.a3 = o40.t(this, 203);
        this.b3 = o40.t(this, 205);
        this.c3 = o40.t(this, 204);
        this.d3 = o40.t(this, 206);
    }

    public static void A(w91 w91Var, a aVar) {
        aVar.c = (lu7) w91Var.h.get();
        aVar.d = dr1.a(w91Var.v);
    }

    public static void B(w91 w91Var, gp3 gp3Var) {
        gp3Var.a = (dp3) w91Var.v.get();
        gp3Var.b = (a) w91Var.x.get();
    }

    public static void C(w91 w91Var, fr3 fr3Var) {
        fr3Var.languageHelper = (d04) w91Var.p.get();
        fr3Var.authorizationManager = (i10) w91Var.y.get();
        fr3Var.requestProxy = (x57) w91Var.G.get();
        fr3Var.serverMonitor = (bp7) w91Var.K.get();
        fr3Var.accountManager = (c5) w91Var.L.get();
        fr3Var.context = w91Var.a.a;
        fr3Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        fr3Var.miuiUtils = (fw4) w91Var.M.get();
        fr3Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void D(w91 w91Var, j84 j84Var) {
        j84Var.a = (ee) w91Var.o.get();
    }

    public static void E(w91 w91Var, c05 c05Var) {
        c05Var.languageHelper = (d04) w91Var.p.get();
        c05Var.authorizationManager = (i10) w91Var.y.get();
        c05Var.requestProxy = (x57) w91Var.G.get();
        c05Var.serverMonitor = (bp7) w91Var.K.get();
        c05Var.accountManager = (c5) w91Var.L.get();
        c05Var.context = w91Var.a.a;
        c05Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        c05Var.miuiUtils = (fw4) w91Var.M.get();
        c05Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void F(w91 w91Var, MovieDownloadUrlService movieDownloadUrlService) {
        movieDownloadUrlService.languageHelper = (d04) w91Var.p.get();
        movieDownloadUrlService.authorizationManager = (i10) w91Var.y.get();
        movieDownloadUrlService.requestProxy = (x57) w91Var.G.get();
        movieDownloadUrlService.serverMonitor = (bp7) w91Var.K.get();
        movieDownloadUrlService.accountManager = (c5) w91Var.L.get();
        movieDownloadUrlService.context = w91Var.a.a;
        movieDownloadUrlService.sharedPreferencesProxy = (lu7) w91Var.h.get();
        movieDownloadUrlService.miuiUtils = (fw4) w91Var.M.get();
        movieDownloadUrlService.googleUtils = (qu2) w91Var.N.get();
    }

    public static void G(w91 w91Var, wc5 wc5Var) {
        wc5Var.languageHelper = (d04) w91Var.p.get();
        wc5Var.authorizationManager = (i10) w91Var.y.get();
        wc5Var.requestProxy = (x57) w91Var.G.get();
        wc5Var.serverMonitor = (bp7) w91Var.K.get();
        wc5Var.accountManager = (c5) w91Var.L.get();
        wc5Var.context = w91Var.a.a;
        wc5Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        wc5Var.miuiUtils = (fw4) w91Var.M.get();
        wc5Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void H(w91 w91Var, wd5 wd5Var) {
        wd5Var.languageHelper = (d04) w91Var.p.get();
        wd5Var.authorizationManager = (i10) w91Var.y.get();
        wd5Var.requestProxy = (x57) w91Var.G.get();
        wd5Var.serverMonitor = (bp7) w91Var.K.get();
        wd5Var.accountManager = (c5) w91Var.L.get();
        wd5Var.context = w91Var.a.a;
        wd5Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        wd5Var.miuiUtils = (fw4) w91Var.M.get();
        wd5Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void I(w91 w91Var, ir.mservices.market.core.notification.a aVar) {
        aVar.j = (dp3) w91Var.v.get();
        aVar.k = (xf5) w91Var.F.get();
        aVar.l = (lw8) w91Var.E.get();
        aVar.m = (d04) w91Var.p.get();
        aVar.n = (qs1) w91Var.g.get();
        aVar.o = (ps1) w91Var.w.get();
        aVar.p = dr1.a(w91Var.z);
        aVar.q = dr1.a(w91Var.u);
        aVar.r = (lu7) w91Var.h.get();
        aVar.s = dr1.a(w91Var.a0);
        aVar.t = (f) w91Var.c0.get();
    }

    public static void J(w91 w91Var, ry5 ry5Var) {
        ry5Var.languageHelper = (d04) w91Var.p.get();
        ry5Var.authorizationManager = (i10) w91Var.y.get();
        ry5Var.requestProxy = (x57) w91Var.G.get();
        ry5Var.serverMonitor = (bp7) w91Var.K.get();
        ry5Var.accountManager = (c5) w91Var.L.get();
        ry5Var.context = w91Var.a.a;
        ry5Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        ry5Var.miuiUtils = (fw4) w91Var.M.get();
        ry5Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void K(w91 w91Var, zn6 zn6Var) {
        zn6Var.languageHelper = (d04) w91Var.p.get();
        zn6Var.authorizationManager = (i10) w91Var.y.get();
        zn6Var.requestProxy = (x57) w91Var.G.get();
        zn6Var.serverMonitor = (bp7) w91Var.K.get();
        zn6Var.accountManager = (c5) w91Var.L.get();
        zn6Var.context = w91Var.a.a;
        zn6Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        zn6Var.miuiUtils = (fw4) w91Var.M.get();
        zn6Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void L(w91 w91Var, e eVar) {
        eVar.languageHelper = (d04) w91Var.p.get();
        eVar.authorizationManager = (i10) w91Var.y.get();
        eVar.requestProxy = (x57) w91Var.G.get();
        eVar.serverMonitor = (bp7) w91Var.K.get();
        eVar.accountManager = (c5) w91Var.L.get();
        eVar.context = w91Var.a.a;
        eVar.sharedPreferencesProxy = (lu7) w91Var.h.get();
        eVar.miuiUtils = (fw4) w91Var.M.get();
        eVar.googleUtils = (qu2) w91Var.N.get();
    }

    public static void M(w91 w91Var, ly6 ly6Var) {
        ly6Var.languageHelper = (d04) w91Var.p.get();
        ly6Var.authorizationManager = (i10) w91Var.y.get();
        ly6Var.requestProxy = (x57) w91Var.G.get();
        ly6Var.serverMonitor = (bp7) w91Var.K.get();
        ly6Var.accountManager = (c5) w91Var.L.get();
        ly6Var.context = w91Var.a.a;
        ly6Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        ly6Var.miuiUtils = (fw4) w91Var.M.get();
        ly6Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void N(w91 w91Var, x57 x57Var) {
    }

    public static void O(w91 w91Var, a97 a97Var) {
        a97Var.languageHelper = (d04) w91Var.p.get();
        a97Var.authorizationManager = (i10) w91Var.y.get();
        a97Var.requestProxy = (x57) w91Var.G.get();
        a97Var.serverMonitor = (bp7) w91Var.K.get();
        a97Var.accountManager = (c5) w91Var.L.get();
        a97Var.context = w91Var.a.a;
        a97Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        a97Var.miuiUtils = (fw4) w91Var.M.get();
        a97Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void P(w91 w91Var, mr7 mr7Var) {
        mr7Var.a = (ee) w91Var.o.get();
        mr7Var.b = (d04) w91Var.p.get();
        mr7Var.c = (rf7) w91Var.r.get();
        mr7Var.d = (pr7) w91Var.s.get();
    }

    public static void Q(w91 w91Var, pr7 pr7Var) {
        pr7Var.a = (lu7) w91Var.h.get();
        pr7Var.b = dr1.a(w91Var.t);
    }

    public static void R(w91 w91Var, lu7 lu7Var) {
        lu7Var.a = w91Var.a.a;
    }

    public static void S(w91 w91Var, t98 t98Var) {
        t98Var.languageHelper = (d04) w91Var.p.get();
        t98Var.authorizationManager = (i10) w91Var.y.get();
        t98Var.requestProxy = (x57) w91Var.G.get();
        t98Var.serverMonitor = (bp7) w91Var.K.get();
        t98Var.accountManager = (c5) w91Var.L.get();
        t98Var.context = w91Var.a.a;
        t98Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        t98Var.miuiUtils = (fw4) w91Var.M.get();
        t98Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void T(w91 w91Var, uc8 uc8Var) {
        uc8Var.languageHelper = (d04) w91Var.p.get();
        uc8Var.authorizationManager = (i10) w91Var.y.get();
        uc8Var.requestProxy = (x57) w91Var.G.get();
        uc8Var.serverMonitor = (bp7) w91Var.K.get();
        uc8Var.accountManager = (c5) w91Var.L.get();
        uc8Var.context = w91Var.a.a;
        uc8Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        uc8Var.miuiUtils = (fw4) w91Var.M.get();
        uc8Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void U(w91 w91Var, y19 y19Var) {
        y19Var.languageHelper = (d04) w91Var.p.get();
        y19Var.authorizationManager = (i10) w91Var.y.get();
        y19Var.requestProxy = (x57) w91Var.G.get();
        y19Var.serverMonitor = (bp7) w91Var.K.get();
        y19Var.accountManager = (c5) w91Var.L.get();
        y19Var.context = w91Var.a.a;
        y19Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        y19Var.miuiUtils = (fw4) w91Var.M.get();
        y19Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void d(w91 w91Var, c5 c5Var) {
        c5Var.c = dr1.a(w91Var.P);
        c5Var.d = (i10) w91Var.y.get();
        c5Var.e = (x57) w91Var.G.get();
        c5Var.f = dr1.a(w91Var.R);
    }

    public static void e(w91 w91Var, b bVar) {
        bVar.languageHelper = (d04) w91Var.p.get();
        bVar.authorizationManager = (i10) w91Var.y.get();
        bVar.requestProxy = (x57) w91Var.G.get();
        bVar.serverMonitor = (bp7) w91Var.K.get();
        bVar.accountManager = (c5) w91Var.L.get();
        bVar.context = w91Var.a.a;
        bVar.sharedPreferencesProxy = (lu7) w91Var.h.get();
        bVar.miuiUtils = (fw4) w91Var.M.get();
        bVar.googleUtils = (qu2) w91Var.N.get();
    }

    public static void f(w91 w91Var, na naVar) {
        naVar.languageHelper = (d04) w91Var.p.get();
        naVar.authorizationManager = (i10) w91Var.y.get();
        naVar.requestProxy = (x57) w91Var.G.get();
        naVar.serverMonitor = (bp7) w91Var.K.get();
        naVar.accountManager = (c5) w91Var.L.get();
        naVar.context = w91Var.a.a;
        naVar.sharedPreferencesProxy = (lu7) w91Var.h.get();
        naVar.miuiUtils = (fw4) w91Var.M.get();
        naVar.googleUtils = (qu2) w91Var.N.get();
    }

    public static void g(w91 w91Var, i10 i10Var) {
        i10Var.b = (lu7) w91Var.h.get();
    }

    public static void h(w91 w91Var, td0 td0Var) {
        td0Var.languageHelper = (d04) w91Var.p.get();
        td0Var.authorizationManager = (i10) w91Var.y.get();
        td0Var.requestProxy = (x57) w91Var.G.get();
        td0Var.serverMonitor = (bp7) w91Var.K.get();
        td0Var.accountManager = (c5) w91Var.L.get();
        td0Var.context = w91Var.a.a;
        td0Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        td0Var.miuiUtils = (fw4) w91Var.M.get();
        td0Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void i(w91 w91Var, we0 we0Var) {
        we0Var.a = (ee) w91Var.o.get();
    }

    public static void j(w91 w91Var, iq0 iq0Var) {
        iq0Var.languageHelper = (d04) w91Var.p.get();
        iq0Var.authorizationManager = (i10) w91Var.y.get();
        iq0Var.requestProxy = (x57) w91Var.G.get();
        iq0Var.serverMonitor = (bp7) w91Var.K.get();
        iq0Var.accountManager = (c5) w91Var.L.get();
        iq0Var.context = w91Var.a.a;
        iq0Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        iq0Var.miuiUtils = (fw4) w91Var.M.get();
        iq0Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void k(w91 w91Var, fw0 fw0Var) {
        fw0Var.a = (dp3) w91Var.v.get();
        fw0Var.b = (ir.mservices.market.version2.manager.a) w91Var.D.get();
    }

    public static void l(w91 w91Var, ww0 ww0Var) {
        ww0Var.languageHelper = (d04) w91Var.p.get();
        ww0Var.authorizationManager = (i10) w91Var.y.get();
        ww0Var.requestProxy = (x57) w91Var.G.get();
        ww0Var.serverMonitor = (bp7) w91Var.K.get();
        ww0Var.accountManager = (c5) w91Var.L.get();
        ww0Var.context = w91Var.a.a;
        ww0Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        ww0Var.miuiUtils = (fw4) w91Var.M.get();
        ww0Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void m(w91 w91Var, if1 if1Var) {
        if1Var.a = (dp3) w91Var.v.get();
        if1Var.b = (a) w91Var.x.get();
        if1Var.c = (bp3) w91Var.d1.get();
    }

    public static void n(w91 w91Var, fk1 fk1Var) {
    }

    public static void o(w91 w91Var, gk1 gk1Var) {
        gk1Var.languageHelper = (d04) w91Var.p.get();
        gk1Var.authorizationManager = (i10) w91Var.y.get();
        gk1Var.requestProxy = (x57) w91Var.G.get();
        gk1Var.serverMonitor = (bp7) w91Var.K.get();
        gk1Var.accountManager = (c5) w91Var.L.get();
        gk1Var.context = w91Var.a.a;
        gk1Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        gk1Var.miuiUtils = (fw4) w91Var.M.get();
        gk1Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void p(w91 w91Var, pl1 pl1Var) {
        pl1Var.languageHelper = (d04) w91Var.p.get();
        pl1Var.authorizationManager = (i10) w91Var.y.get();
        pl1Var.requestProxy = (x57) w91Var.G.get();
        pl1Var.serverMonitor = (bp7) w91Var.K.get();
        pl1Var.accountManager = (c5) w91Var.L.get();
        pl1Var.context = w91Var.a.a;
        pl1Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        pl1Var.miuiUtils = (fw4) w91Var.M.get();
        pl1Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void q(w91 w91Var, ps1 ps1Var) {
        ps1Var.i = dr1.a(w91Var.u);
        ps1Var.j = dr1.a(w91Var.z);
        ps1Var.k = (c) w91Var.l0.get();
        ps1Var.l = dr1.a(w91Var.v);
        ps1Var.m = (c5) w91Var.L.get();
        ps1Var.n = (k68) w91Var.V.get();
        ps1Var.o = (d56) w91Var.U.get();
        ps1Var.p = (b56) w91Var.A.get();
        ps1Var.q = (d) w91Var.S.get();
        ps1Var.r = dr1.a(w91Var.c0);
    }

    public static void r(w91 w91Var, kt1 kt1Var) {
        kt1Var.languageHelper = (d04) w91Var.p.get();
        kt1Var.authorizationManager = (i10) w91Var.y.get();
        kt1Var.requestProxy = (x57) w91Var.G.get();
        kt1Var.serverMonitor = (bp7) w91Var.K.get();
        kt1Var.accountManager = (c5) w91Var.L.get();
        kt1Var.context = w91Var.a.a;
        kt1Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        kt1Var.miuiUtils = (fw4) w91Var.M.get();
        kt1Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void s(w91 w91Var, ey1 ey1Var) {
        ey1Var.languageHelper = (d04) w91Var.p.get();
        ey1Var.authorizationManager = (i10) w91Var.y.get();
        ey1Var.requestProxy = (x57) w91Var.G.get();
        ey1Var.serverMonitor = (bp7) w91Var.K.get();
        ey1Var.accountManager = (c5) w91Var.L.get();
        ey1Var.context = w91Var.a.a;
        ey1Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        ey1Var.miuiUtils = (fw4) w91Var.M.get();
        ey1Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void t(w91 w91Var, x92 x92Var) {
        x92Var.languageHelper = (d04) w91Var.p.get();
        x92Var.authorizationManager = (i10) w91Var.y.get();
        x92Var.requestProxy = (x57) w91Var.G.get();
        x92Var.serverMonitor = (bp7) w91Var.K.get();
        x92Var.accountManager = (c5) w91Var.L.get();
        x92Var.context = w91Var.a.a;
        x92Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        x92Var.miuiUtils = (fw4) w91Var.M.get();
        x92Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void u(w91 w91Var, fh2 fh2Var) {
        fh2Var.languageHelper = (d04) w91Var.p.get();
        fh2Var.authorizationManager = (i10) w91Var.y.get();
        fh2Var.requestProxy = (x57) w91Var.G.get();
        fh2Var.serverMonitor = (bp7) w91Var.K.get();
        fh2Var.accountManager = (c5) w91Var.L.get();
        fh2Var.context = w91Var.a.a;
        fh2Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        fh2Var.miuiUtils = (fw4) w91Var.M.get();
        fh2Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void v(w91 w91Var, gh2 gh2Var) {
        gh2Var.languageHelper = (d04) w91Var.p.get();
        gh2Var.authorizationManager = (i10) w91Var.y.get();
        gh2Var.requestProxy = (x57) w91Var.G.get();
        gh2Var.serverMonitor = (bp7) w91Var.K.get();
        gh2Var.accountManager = (c5) w91Var.L.get();
        gh2Var.context = w91Var.a.a;
        gh2Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        gh2Var.miuiUtils = (fw4) w91Var.M.get();
        gh2Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void w(w91 w91Var, d dVar) {
        dVar.languageHelper = (d04) w91Var.p.get();
        dVar.authorizationManager = (i10) w91Var.y.get();
        dVar.requestProxy = (x57) w91Var.G.get();
        dVar.serverMonitor = (bp7) w91Var.K.get();
        dVar.accountManager = (c5) w91Var.L.get();
        dVar.context = w91Var.a.a;
        dVar.sharedPreferencesProxy = (lu7) w91Var.h.get();
        dVar.miuiUtils = (fw4) w91Var.M.get();
        dVar.googleUtils = (qu2) w91Var.N.get();
    }

    public static void x(w91 w91Var, zb3 zb3Var) {
        zb3Var.languageHelper = (d04) w91Var.p.get();
        zb3Var.authorizationManager = (i10) w91Var.y.get();
        zb3Var.requestProxy = (x57) w91Var.G.get();
        zb3Var.serverMonitor = (bp7) w91Var.K.get();
        zb3Var.accountManager = (c5) w91Var.L.get();
        zb3Var.context = w91Var.a.a;
        zb3Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
        zb3Var.miuiUtils = (fw4) w91Var.M.get();
        zb3Var.googleUtils = (qu2) w91Var.N.get();
    }

    public static void y(w91 w91Var, zo3 zo3Var) {
        zo3Var.j = (dp3) w91Var.v.get();
        zo3Var.k = (ps1) w91Var.w.get();
        zo3Var.l = (ye5) w91Var.c1.get();
        zo3Var.m = (if1) w91Var.e1.get();
        zo3Var.n = (lu7) w91Var.h.get();
        zo3Var.o = (a) w91Var.x.get();
        zo3Var.p = (ir.mservices.market.core.notification.a) w91Var.T.get();
    }

    public static void z(w91 w91Var, dp3 dp3Var) {
        dp3Var.b = (dv2) w91Var.q.get();
        dp3Var.c = w91Var.a.a;
        dr1.a(w91Var.u);
        dp3Var.d = (pr7) w91Var.s.get();
        dp3Var.e = (lu7) w91Var.h.get();
        dp3Var.f = (k68) w91Var.V.get();
        dp3Var.g = (a) w91Var.x.get();
        dp3Var.h = (f) w91Var.c0.get();
    }

    public final vp7 A0() {
        return new vp7((k09) this.m2.get(), (ir.mservices.market.version2.manager.d) this.A0.get(), (ec9) this.C.get(), this.a.a);
    }

    public final z4 B0() {
        return new z4((wc5) this.E1.get(), Y(), new f5((wc5) this.E1.get(), 2), new ub0((wc5) this.E1.get(), 0), new pt2((wc5) this.E1.get()), new ub0((wc5) this.E1.get(), 1), new e4((wc5) this.E1.get(), 1), new f5((wc5) this.E1.get(), 0), new e4((wc5) this.E1.get(), 0), new f5((wc5) this.E1.get(), 1));
    }

    public final xg5 C0() {
        return new xg5((bh5) this.o2.get());
    }

    public final wo5 D0() {
        t32 t32Var = (t32) this.f.get();
        wo5 wo5Var = new wo5();
        t32Var.l(wo5Var, false);
        wo5Var.a = (ee) this.o.get();
        return wo5Var;
    }

    public final vo4 E0() {
        return new vo4((vl6) this.p2.get());
    }

    public final sk6 F0() {
        return new sk6((a97) this.C1.get(), (uc8) this.z1.get(), this.a.a);
    }

    public final rn6 G0() {
        rn6 rn6Var = new rn6(4, false);
        rn6Var.b = (ee) this.o.get();
        return rn6Var;
    }

    public final rn6 H0() {
        return new rn6((t98) this.D1.get(), (uc8) this.z1.get(), (a97) this.C1.get());
    }

    public final ir.mservices.market.app.update.common.modal.a I0() {
        return new ir.mservices.market.app.update.common.modal.a((dp3) this.v.get(), (ir.mservices.market.app.update.common.manager.b) this.k0.get(), (ir.mservices.market.app.update.common.manager.a) this.h0.get(), (wt) this.z.get(), (dx4) this.m0.get(), (ir.mservices.market.common.install.a) this.n0.get());
    }

    public final rn6 J0() {
        return new rn6((uz8) this.f0.get(), this.a.a);
    }

    public final ir.mservices.market.vpnService.adGuard.ui.model.a V() {
        return new ir.mservices.market.vpnService.adGuard.ui.model.a(this.a.a, (na) this.v1.get(), (kb9) this.B.get(), (ma) this.w1.get());
    }

    public final v24 W() {
        gk1 gk1Var = (gk1) this.y1.get();
        uc8 uc8Var = (uc8) this.z1.get();
        rf7 rf7Var = (rf7) this.r.get();
        ir.mservices.market.core.notification.a aVar = (ir.mservices.market.core.notification.a) this.T.get();
        dp3 dp3Var = (dp3) this.v.get();
        d56 d56Var = (d56) this.U.get();
        ir.mservices.market.common.model.a aVar2 = (ir.mservices.market.common.model.a) this.R.get();
        Context context = this.a.a;
        js3.p(gk1Var, "detailService");
        js3.p(uc8Var, "surveyService");
        js3.p(rf7Var, "screenQualityHelper");
        js3.p(aVar, "notificationController");
        js3.p(dp3Var, "installManager");
        js3.p(d56Var, "permissionHelper");
        js3.p(aVar2, "submitCommentRepository");
        v24 v24Var = new v24();
        v24Var.a = gk1Var;
        v24Var.b = uc8Var;
        v24Var.c = rf7Var;
        v24Var.d = aVar;
        v24Var.e = dp3Var;
        v24Var.f = d56Var;
        v24Var.g = aVar2;
        v24Var.h = context;
        return v24Var;
    }

    public final nm5 X() {
        return new nm5((ir.mservices.market.version2.manager.b) this.E0.get());
    }

    public final wv8 Y() {
        return new wv8((wc5) this.E1.get(), (g76) this.O.get(), this.a.a);
    }

    public final k50 Z() {
        t32 t32Var = (t32) this.f.get();
        k50 k50Var = new k50();
        t32Var.l(k50Var, false);
        k50Var.a = (ee) this.o.get();
        k50Var.b = (ps1) this.w.get();
        return k50Var;
    }

    public final vp7 a0() {
        return new vp7(this.a.a, (iq0) this.H1.get(), (kb9) this.B.get(), (hq0) this.I1.get());
    }

    public final qm5 b0() {
        return new qm5((dp3) this.v.get(), (wd5) this.J1.get());
    }

    public final r79 c0() {
        return new r79((et1) this.n2.get());
    }

    public final ir.mservices.market.download.app.model.a d0() {
        return new ir.mservices.market.download.app.model.a((ps1) this.w.get(), (kt1) this.M1.get(), (ir.mservices.market.version2.manager.a) this.D.get());
    }

    public final wv8 e0() {
        return new wv8(f0(), (wt) this.z.get(), J0());
    }

    public final n72 f0() {
        n72 n72Var = new n72();
        n72Var.languageHelper = (d04) this.p.get();
        n72Var.authorizationManager = (i10) this.y.get();
        n72Var.requestProxy = (x57) this.G.get();
        n72Var.serverMonitor = (bp7) this.K.get();
        n72Var.accountManager = (c5) this.L.get();
        n72Var.context = this.a.a;
        n72Var.sharedPreferencesProxy = (lu7) this.h.get();
        n72Var.miuiUtils = (fw4) this.M.get();
        n72Var.googleUtils = (qu2) this.N.get();
        return n72Var;
    }

    public final qq4 g0() {
        x92 x92Var = (x92) this.O1.get();
        Context context = this.a.a;
        js3.p(x92Var, "feedbackService");
        qq4 qq4Var = new qq4();
        qq4Var.a = x92Var;
        qq4Var.b = context;
        return qq4Var;
    }

    public final vp7 h0() {
        return new vp7(this.a.a, (zb3) this.P1.get(), (d04) this.p.get(), (ir.mservices.market.core.notification.a) this.T.get());
    }

    public final on i0() {
        gk1 gk1Var = (gk1) this.y1.get();
        rf7 rf7Var = (rf7) this.r.get();
        ir.mservices.market.core.notification.a aVar = (ir.mservices.market.core.notification.a) this.T.get();
        dp3 dp3Var = (dp3) this.v.get();
        d56 d56Var = (d56) this.U.get();
        Context context = this.a.a;
        js3.p(gk1Var, "detailService");
        js3.p(rf7Var, "screenQualityHelper");
        js3.p(aVar, "notificationController");
        js3.p(dp3Var, "installManager");
        js3.p(d56Var, "permissionHelper");
        on onVar = new on();
        onVar.a = gk1Var;
        onVar.b = rf7Var;
        onVar.c = aVar;
        onVar.d = dp3Var;
        onVar.e = d56Var;
        onVar.f = context;
        return onVar;
    }

    public final ir.mservices.market.myReview.incomplete.model.b j0() {
        return new ir.mservices.market.myReview.incomplete.model.b((ir.mservices.market.common.install.a) this.n0.get(), (wd5) this.J1.get());
    }

    public final ir.mservices.market.myAccount.inbox.model.a k0() {
        return new ir.mservices.market.myAccount.inbox.model.a(this.a.a, (zl3) this.S1.get());
    }

    public final void l0(PackageInstallationChangeReceiver packageInstallationChangeReceiver) {
        packageInstallationChangeReceiver.c = (ir.mservices.market.app.update.common.manager.a) this.h0.get();
        packageInstallationChangeReceiver.d = (dp3) this.v.get();
        packageInstallationChangeReceiver.e = (lu7) this.h.get();
    }

    public final ir.mservices.market.pika.receive.model.a m0() {
        return new ir.mservices.market.pika.receive.model.a(this.a.a, (dp3) this.v.get(), (t32) this.f.get());
    }

    public final ir.mservices.market.pika.send.model.c n0() {
        return new ir.mservices.market.pika.send.model.c(this.a.a, (dp3) this.v.get(), (lw8) this.E.get(), (ir.mservices.market.common.install.a) this.n0.get());
    }

    public final ol3 o0() {
        return new ol3(1);
    }

    public final hh2 p0() {
        return new hh2((m54) this.U1.get(), (o5) this.V1.get());
    }

    public final sl3 q0() {
        js3.p((yo) this.b2.get(), "appDescriptionService");
        return new sl3(5);
    }

    public final ut4 r0() {
        return new ut4((c05) this.B1.get());
    }

    public final ck4 s0() {
        return new ck4((e05) this.d2.get());
    }

    public final ql4 t0() {
        return new ql4((e05) this.d2.get());
    }

    public final pa2 u0() {
        return new pa2(this.a.a, (c75) this.R1.get(), (ir.mservices.market.version2.manager.d) this.A0.get());
    }

    public final pa2 v0() {
        return new pa2(this.a.a, (c75) this.R1.get(), (ir.mservices.market.core.notification.a) this.T.get());
    }

    public final nc2 w0() {
        return new nc2((o25) this.j2.get(), (n25) this.a0.get());
    }

    public final k45 x0() {
        return new k45((c75) this.R1.get());
    }

    public final vo4 y0() {
        return new vo4((c75) this.R1.get());
    }

    public final ck4 z0() {
        return new ck4((c75) this.R1.get());
    }
}
