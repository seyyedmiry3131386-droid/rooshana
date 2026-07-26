package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.j256.ormlite.dao.Dao;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.movie.download.core.url.MovieDownloadUrlService;
import ir.mservices.market.movie.download.core.url.MovieDownloadUrlService_Factory;
import ir.mservices.market.movie.ui.detail.review.model.a;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.receive.model.b;
import ir.mservices.market.search.history.model.SearchHistoryModel;
import ir.mservices.market.version2.manager.install.f;
import ir.mservices.market.version2.model.CallbackUrlModel;
import ir.mservices.market.version2.model.InActiveAppUpdateModel;
import ir.mservices.market.version2.model.InboxInfoModel;
import ir.mservices.market.version2.model.MovieSearchHistoryModel;
import ir.mservices.market.version2.model.MovieWatchProgressModel;
import ir.mservices.market.version2.model.UserSearchHistoryModel;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.services.e;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v91 implements on6 {
    public final w91 a;
    public final int b;

    public v91(w91 w91Var, int i) {
        this.a = w91Var;
        this.b = i;
    }

    public final Object a() {
        w91 w91Var = this.a;
        int i = this.b;
        switch (i) {
            case 100:
                we0 we0VarB = m4.b();
                w91.i(w91Var, we0VarB);
                return we0VarB;
            case 101:
                zo3 zo3VarF = jq0.f();
                w91.y(w91Var, zo3VarF);
                return zo3VarF;
            case 102:
                return te5.o(w91Var.b, (t32) w91Var.f.get());
            case 103:
                if1 if1VarB = jq0.b((t32) w91Var.f.get());
                w91.m(w91Var, if1VarB);
                return if1VarB;
            case 104:
                return new bp3((d) w91Var.S.get(), (dp3) w91Var.v.get(), (c5) w91Var.L.get(), (fw4) w91Var.M.get());
            case 105:
                gp3 gp3VarB = ep3.b();
                w91.B(w91Var, gp3VarB);
                return gp3VarB;
            case 106:
                fr3 fr3VarC = ep3.c();
                w91.C(w91Var, fr3VarC);
                return fr3VarC;
            case 107:
                fw0 fw0VarA = jq0.a();
                w91.k(w91Var, fw0VarA);
                return fw0VarA;
            case 108:
                return new ra3((ee) w91Var.o.get());
            case 109:
                fk1 fk1VarC = jq0.c();
                w91.n(w91Var, fk1VarC);
                return fk1VarC;
            case 110:
                j84 j84VarD = ep3.d();
                w91.D(w91Var, j84VarD);
                return j84VarD;
            case 111:
                return new pk0();
            case 112:
                e eVarM = te5.m();
                w91.L(w91Var, eVarM);
                return eVarM;
            case 113:
                return new bv0();
            case 114:
                return jq0.w(w91Var.c, (jb1) w91Var.i0.get());
            case 115:
                fh2 fh2VarE = jq0.e();
                w91.u(w91Var, fh2VarE);
                return fh2VarE;
            case 116:
                return new t19((y19) w91Var.r1.get());
            case 117:
                y19 y19Var = new y19();
                w91.U(w91Var, y19Var);
                return y19Var;
            case 118:
                gh2 gh2Var = new gh2();
                w91.v(w91Var, gh2Var);
                return gh2Var;
            case 119:
                return new cw5();
            case 120:
                na naVar = new na();
                w91.f(w91Var, naVar);
                return naVar;
            case 121:
                return new ma(m4.w(w91Var.a));
            case 122:
                td0 td0Var = new td0();
                w91.h(w91Var, td0Var);
                return td0Var;
            case 123:
                gk1 gk1Var = new gk1();
                w91.o(w91Var, gk1Var);
                return gk1Var;
            case 124:
                uc8 uc8Var = new uc8();
                w91.T(w91Var, uc8Var);
                return uc8Var;
            case 125:
                ly6 ly6Var = new ly6();
                w91.M(w91Var, ly6Var);
                return ly6Var;
            case 126:
                c05 c05Var = new c05();
                w91.E(w91Var, c05Var);
                return c05Var;
            case 127:
                a97 a97Var = new a97();
                w91.O(w91Var, a97Var);
                return a97Var;
            case 128:
                t98 t98Var = new t98();
                w91.S(w91Var, t98Var);
                return t98Var;
            case 129:
                wc5 wc5Var = new wc5();
                w91.G(w91Var, wc5Var);
                return wc5Var;
            case 130:
                return new b90((ey1) w91Var.F1.get());
            case 131:
                ey1 ey1Var = new ey1();
                w91.s(w91Var, ey1Var);
                return ey1Var;
            case 132:
                iq0 iq0Var = new iq0();
                w91.j(w91Var, iq0Var);
                return iq0Var;
            case 133:
                return new hq0(m4.w(w91Var.a));
            case 134:
                wd5 wd5Var = new wd5();
                w91.H(w91Var, wd5Var);
                return wd5Var;
            case 135:
                return new ol1(w91Var.a.a, (pl1) w91Var.K1.get());
            case 136:
                pl1 pl1Var = new pl1();
                w91.p(w91Var, pl1Var);
                return pl1Var;
            case 137:
                kt1 kt1Var = new kt1();
                w91.r(w91Var, kt1Var);
                return kt1Var;
            case 138:
                zn6 zn6Var = new zn6();
                w91.K(w91Var, zn6Var);
                return zn6Var;
            case 139:
                x92 x92Var = new x92();
                w91.t(w91Var, x92Var);
                return x92Var;
            case 140:
                zb3 zb3Var = new zb3();
                w91.x(w91Var, zb3Var);
                return zb3Var;
            case 141:
                ry5 ry5Var = new ry5();
                w91.J(w91Var, ry5Var);
                return ry5Var;
            case 142:
                c75 c75Var = new c75();
                c75Var.languageHelper = (d04) w91Var.p.get();
                c75Var.authorizationManager = (i10) w91Var.y.get();
                c75Var.requestProxy = (x57) w91Var.G.get();
                c75Var.serverMonitor = (bp7) w91Var.K.get();
                c75Var.accountManager = (c5) w91Var.L.get();
                c75Var.context = w91Var.a.a;
                c75Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                c75Var.miuiUtils = (fw4) w91Var.M.get();
                c75Var.googleUtils = (qu2) w91Var.N.get();
                return c75Var;
            case 143:
                cv cvVar = w91Var.c;
                jb1 jb1Var = (jb1) w91Var.i0.get();
                js3.p(jb1Var, "databaseHelper");
                Dao dao = jb1Var.getDao(InboxInfoModel.class);
                js3.o(dao, "getDao(...)");
                return new zl3(dao);
            case 144:
                return new NearbyRepository(w91Var.a.a);
            case 145:
                m54 m54Var = new m54();
                m54Var.languageHelper = (d04) w91Var.p.get();
                m54Var.authorizationManager = (i10) w91Var.y.get();
                m54Var.requestProxy = (x57) w91Var.G.get();
                m54Var.serverMonitor = (bp7) w91Var.K.get();
                m54Var.accountManager = (c5) w91Var.L.get();
                m54Var.context = w91Var.a.a;
                m54Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                m54Var.miuiUtils = (fw4) w91Var.M.get();
                m54Var.googleUtils = (qu2) w91Var.N.get();
                return m54Var;
            case 146:
                o5 o5Var = new o5();
                o5Var.languageHelper = (d04) w91Var.p.get();
                o5Var.authorizationManager = (i10) w91Var.y.get();
                o5Var.requestProxy = (x57) w91Var.G.get();
                o5Var.serverMonitor = (bp7) w91Var.K.get();
                o5Var.accountManager = (c5) w91Var.L.get();
                o5Var.context = w91Var.a.a;
                o5Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                o5Var.miuiUtils = (fw4) w91Var.M.get();
                o5Var.googleUtils = (qu2) w91Var.N.get();
                return o5Var;
            case 147:
                return new zd4(w91Var.a.a, (c5) w91Var.L.get(), (ae4) w91Var.W1.get());
            case 148:
                ae4 ae4Var = new ae4();
                ae4Var.languageHelper = (d04) w91Var.p.get();
                ae4Var.authorizationManager = (i10) w91Var.y.get();
                ae4Var.requestProxy = (x57) w91Var.G.get();
                ae4Var.serverMonitor = (bp7) w91Var.K.get();
                ae4Var.accountManager = (c5) w91Var.L.get();
                ae4Var.context = w91Var.a.a;
                ae4Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                ae4Var.miuiUtils = (fw4) w91Var.M.get();
                ae4Var.googleUtils = (qu2) w91Var.N.get();
                return ae4Var;
            case 149:
                return new fm8();
            case 150:
                return new vz7(w91Var.a.a, (g4) w91Var.Z1.get());
            case 151:
                t32 t32Var = (t32) w91Var.f.get();
                g4 g4Var = new g4();
                t32Var.l(g4Var, false);
                g4Var.a = (ee) w91Var.o.get();
                g4Var.b = (c5) w91Var.L.get();
                return g4Var;
            case 152:
                yo yoVar = new yo();
                yoVar.languageHelper = (d04) w91Var.p.get();
                yoVar.authorizationManager = (i10) w91Var.y.get();
                yoVar.requestProxy = (x57) w91Var.G.get();
                yoVar.serverMonitor = (bp7) w91Var.K.get();
                yoVar.accountManager = (c5) w91Var.L.get();
                yoVar.context = w91Var.a.a;
                yoVar.sharedPreferencesProxy = (lu7) w91Var.h.get();
                yoVar.miuiUtils = (fw4) w91Var.M.get();
                yoVar.googleUtils = (qu2) w91Var.N.get();
                return yoVar;
            case 153:
                fy4 fy4Var = new fy4();
                fy4Var.languageHelper = (d04) w91Var.p.get();
                fy4Var.authorizationManager = (i10) w91Var.y.get();
                fy4Var.requestProxy = (x57) w91Var.G.get();
                fy4Var.serverMonitor = (bp7) w91Var.K.get();
                fy4Var.accountManager = (c5) w91Var.L.get();
                fy4Var.context = w91Var.a.a;
                fy4Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                fy4Var.miuiUtils = (fw4) w91Var.M.get();
                fy4Var.googleUtils = (qu2) w91Var.N.get();
                return fy4Var;
            case 154:
                e05 e05Var = new e05();
                e05Var.languageHelper = (d04) w91Var.p.get();
                e05Var.authorizationManager = (i10) w91Var.y.get();
                e05Var.requestProxy = (x57) w91Var.G.get();
                e05Var.serverMonitor = (bp7) w91Var.K.get();
                e05Var.accountManager = (c5) w91Var.L.get();
                e05Var.context = w91Var.a.a;
                e05Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                e05Var.miuiUtils = (fw4) w91Var.M.get();
                e05Var.googleUtils = (qu2) w91Var.N.get();
                return e05Var;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                return new a((f75) w91Var.f2.get());
            case 156:
                return new f75((q05) w91Var.e2.get());
            case 157:
                q05 q05Var = new q05();
                q05Var.languageHelper = (d04) w91Var.p.get();
                q05Var.authorizationManager = (i10) w91Var.y.get();
                q05Var.requestProxy = (x57) w91Var.G.get();
                q05Var.serverMonitor = (bp7) w91Var.K.get();
                q05Var.accountManager = (c5) w91Var.L.get();
                q05Var.context = w91Var.a.a;
                q05Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                q05Var.miuiUtils = (fw4) w91Var.M.get();
                q05Var.googleUtils = (qu2) w91Var.N.get();
                return q05Var;
            case 158:
                return new p05((q05) w91Var.e2.get());
            case 159:
                return new y05(w91Var.a.a, new qm5(20, w91Var.f0()), new nm5(19, w91Var.f0()), new t15(11, w91Var.a.a), w91Var.x0(), w91Var.r0());
            case 160:
                o25 o25Var = new o25();
                o25Var.languageHelper = (d04) w91Var.p.get();
                o25Var.authorizationManager = (i10) w91Var.y.get();
                o25Var.requestProxy = (x57) w91Var.G.get();
                o25Var.serverMonitor = (bp7) w91Var.K.get();
                o25Var.accountManager = (c5) w91Var.L.get();
                o25Var.context = w91Var.a.a;
                o25Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                o25Var.miuiUtils = (fw4) w91Var.M.get();
                o25Var.googleUtils = (qu2) w91Var.N.get();
                return o25Var;
            case 161:
                return new u65((v65) w91Var.k2.get());
            case 162:
                v65 v65Var = new v65();
                v65Var.languageHelper = (d04) w91Var.p.get();
                v65Var.authorizationManager = (i10) w91Var.y.get();
                v65Var.requestProxy = (x57) w91Var.G.get();
                v65Var.serverMonitor = (bp7) w91Var.K.get();
                v65Var.accountManager = (c5) w91Var.L.get();
                v65Var.context = w91Var.a.a;
                v65Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                v65Var.miuiUtils = (fw4) w91Var.M.get();
                v65Var.googleUtils = (qu2) w91Var.N.get();
                return v65Var;
            case 163:
                k09 k09Var = new k09();
                k09Var.languageHelper = (d04) w91Var.p.get();
                k09Var.authorizationManager = (i10) w91Var.y.get();
                k09Var.requestProxy = (x57) w91Var.G.get();
                k09Var.serverMonitor = (bp7) w91Var.K.get();
                k09Var.accountManager = (c5) w91Var.L.get();
                k09Var.context = w91Var.a.a;
                k09Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                k09Var.miuiUtils = (fw4) w91Var.M.get();
                k09Var.googleUtils = (qu2) w91Var.N.get();
                return k09Var;
            case 164:
                et1 et1Var = new et1();
                et1Var.languageHelper = (d04) w91Var.p.get();
                et1Var.authorizationManager = (i10) w91Var.y.get();
                et1Var.requestProxy = (x57) w91Var.G.get();
                et1Var.serverMonitor = (bp7) w91Var.K.get();
                et1Var.accountManager = (c5) w91Var.L.get();
                et1Var.context = w91Var.a.a;
                et1Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                et1Var.miuiUtils = (fw4) w91Var.M.get();
                et1Var.googleUtils = (qu2) w91Var.N.get();
                return et1Var;
            case 165:
                bh5 bh5Var = new bh5();
                bh5Var.languageHelper = (d04) w91Var.p.get();
                bh5Var.authorizationManager = (i10) w91Var.y.get();
                bh5Var.requestProxy = (x57) w91Var.G.get();
                bh5Var.serverMonitor = (bp7) w91Var.K.get();
                bh5Var.accountManager = (c5) w91Var.L.get();
                bh5Var.context = w91Var.a.a;
                bh5Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                bh5Var.miuiUtils = (fw4) w91Var.M.get();
                bh5Var.googleUtils = (qu2) w91Var.N.get();
                return bh5Var;
            case 166:
                vl6 vl6Var = new vl6();
                vl6Var.languageHelper = (d04) w91Var.p.get();
                vl6Var.authorizationManager = (i10) w91Var.y.get();
                vl6Var.requestProxy = (x57) w91Var.G.get();
                vl6Var.serverMonitor = (bp7) w91Var.K.get();
                vl6Var.accountManager = (c5) w91Var.L.get();
                vl6Var.context = w91Var.a.a;
                vl6Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                vl6Var.miuiUtils = (fw4) w91Var.M.get();
                vl6Var.googleUtils = (qu2) w91Var.N.get();
                return vl6Var;
            case 167:
                return new x86(w91Var.a.a, (c5) w91Var.L.get(), (y86) w91Var.q2.get());
            case 168:
                y86 y86Var = new y86();
                y86Var.languageHelper = (d04) w91Var.p.get();
                y86Var.authorizationManager = (i10) w91Var.y.get();
                y86Var.requestProxy = (x57) w91Var.G.get();
                y86Var.serverMonitor = (bp7) w91Var.K.get();
                y86Var.accountManager = (c5) w91Var.L.get();
                y86Var.context = w91Var.a.a;
                y86Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                y86Var.miuiUtils = (fw4) w91Var.M.get();
                y86Var.googleUtils = (qu2) w91Var.N.get();
                return y86Var;
            case 169:
                qb8 qb8Var = new qb8();
                qb8Var.languageHelper = (d04) w91Var.p.get();
                qb8Var.authorizationManager = (i10) w91Var.y.get();
                qb8Var.requestProxy = (x57) w91Var.G.get();
                qb8Var.serverMonitor = (bp7) w91Var.K.get();
                qb8Var.accountManager = (c5) w91Var.L.get();
                qb8Var.context = w91Var.a.a;
                qb8Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                qb8Var.miuiUtils = (fw4) w91Var.M.get();
                qb8Var.googleUtils = (qu2) w91Var.N.get();
                return qb8Var;
            case 170:
                na6 na6Var = new na6();
                na6Var.languageHelper = (d04) w91Var.p.get();
                na6Var.authorizationManager = (i10) w91Var.y.get();
                na6Var.requestProxy = (x57) w91Var.G.get();
                na6Var.serverMonitor = (bp7) w91Var.K.get();
                na6Var.accountManager = (c5) w91Var.L.get();
                na6Var.context = w91Var.a.a;
                na6Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                na6Var.miuiUtils = (fw4) w91Var.M.get();
                na6Var.googleUtils = (qu2) w91Var.N.get();
                return na6Var;
            case 171:
                return new bl6();
            case 172:
                return new sr((tr) w91Var.v2.get());
            case 173:
                tr trVar = new tr();
                trVar.languageHelper = (d04) w91Var.p.get();
                trVar.authorizationManager = (i10) w91Var.y.get();
                trVar.requestProxy = (x57) w91Var.G.get();
                trVar.serverMonitor = (bp7) w91Var.K.get();
                trVar.accountManager = (c5) w91Var.L.get();
                trVar.context = w91Var.a.a;
                trVar.sharedPreferencesProxy = (lu7) w91Var.h.get();
                trVar.miuiUtils = (fw4) w91Var.M.get();
                trVar.googleUtils = (qu2) w91Var.N.get();
                return trVar;
            case 174:
                return new um7((gm) w91Var.x2.get(), (zz4) w91Var.y2.get());
            case 175:
                gm gmVar = new gm();
                gmVar.languageHelper = (d04) w91Var.p.get();
                gmVar.authorizationManager = (i10) w91Var.y.get();
                gmVar.requestProxy = (x57) w91Var.G.get();
                gmVar.serverMonitor = (bp7) w91Var.K.get();
                gmVar.accountManager = (c5) w91Var.L.get();
                gmVar.context = w91Var.a.a;
                gmVar.sharedPreferencesProxy = (lu7) w91Var.h.get();
                gmVar.miuiUtils = (fw4) w91Var.M.get();
                gmVar.googleUtils = (qu2) w91Var.N.get();
                return gmVar;
            case 176:
                zz4 zz4Var = new zz4();
                zz4Var.languageHelper = (d04) w91Var.p.get();
                zz4Var.authorizationManager = (i10) w91Var.y.get();
                zz4Var.requestProxy = (x57) w91Var.G.get();
                zz4Var.serverMonitor = (bp7) w91Var.K.get();
                zz4Var.accountManager = (c5) w91Var.L.get();
                zz4Var.context = w91Var.a.a;
                zz4Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                zz4Var.miuiUtils = (fw4) w91Var.M.get();
                zz4Var.googleUtils = (qu2) w91Var.N.get();
                return zz4Var;
            case 177:
                return new s45((t45) w91Var.A2.get());
            case 178:
                t45 t45Var = new t45();
                t45Var.languageHelper = (d04) w91Var.p.get();
                t45Var.authorizationManager = (i10) w91Var.y.get();
                t45Var.requestProxy = (x57) w91Var.G.get();
                t45Var.serverMonitor = (bp7) w91Var.K.get();
                t45Var.accountManager = (c5) w91Var.L.get();
                t45Var.context = w91Var.a.a;
                t45Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                t45Var.miuiUtils = (fw4) w91Var.M.get();
                t45Var.googleUtils = (qu2) w91Var.N.get();
                return t45Var;
            case 179:
                return new cc();
            case 180:
                return new rl6();
            case 181:
                return new b(w91Var.a.a, (k68) w91Var.V.get());
            case 182:
                p17 p17Var = new p17();
                p17Var.languageHelper = (d04) w91Var.p.get();
                p17Var.authorizationManager = (i10) w91Var.y.get();
                p17Var.requestProxy = (x57) w91Var.G.get();
                p17Var.serverMonitor = (bp7) w91Var.K.get();
                p17Var.accountManager = (c5) w91Var.L.get();
                p17Var.context = w91Var.a.a;
                p17Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                p17Var.miuiUtils = (fw4) w91Var.M.get();
                p17Var.googleUtils = (qu2) w91Var.N.get();
                return p17Var;
            case 183:
                v17 v17Var = new v17();
                v17Var.languageHelper = (d04) w91Var.p.get();
                v17Var.authorizationManager = (i10) w91Var.y.get();
                v17Var.requestProxy = (x57) w91Var.G.get();
                v17Var.serverMonitor = (bp7) w91Var.K.get();
                v17Var.accountManager = (c5) w91Var.L.get();
                v17Var.context = w91Var.a.a;
                v17Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                v17Var.miuiUtils = (fw4) w91Var.M.get();
                v17Var.googleUtils = (qu2) w91Var.N.get();
                return v17Var;
            case 184:
                return new u17((ir.mservices.market.reels.download.a) w91Var.H2.get(), (k68) w91Var.V.get());
            case 185:
                return new ir.mservices.market.reels.download.a(dr1.a(w91Var.I2), w91Var.a.a, (k68) w91Var.V.get(), new ut4((v17) w91Var.G2.get()), (b56) w91Var.A.get(), (d56) w91Var.U.get(), (t32) w91Var.f.get());
            case 186:
                fv fvVar = w91Var.d;
                Context context = w91Var.a.a;
                qs1 qs1Var = (qs1) w91Var.g.get();
                ir.mservices.market.reels.download.a aVar = (ir.mservices.market.reels.download.a) w91Var.H2.get();
                js3.p(qs1Var, "downloadOnGoingNotification");
                js3.p(aVar, "reelDownloadManager");
                return new xl5(context, "ReelsNeneDatabase", 1, 1, aVar, null, qs1Var, null);
            case 187:
                y57 y57Var = new y57();
                y57Var.languageHelper = (d04) w91Var.p.get();
                y57Var.authorizationManager = (i10) w91Var.y.get();
                y57Var.requestProxy = (x57) w91Var.G.get();
                y57Var.serverMonitor = (bp7) w91Var.K.get();
                y57Var.accountManager = (c5) w91Var.L.get();
                y57Var.context = w91Var.a.a;
                y57Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                y57Var.miuiUtils = (fw4) w91Var.M.get();
                y57Var.googleUtils = (qu2) w91Var.N.get();
                return y57Var;
            case 188:
                return new mh7((bj7) w91Var.L2.get());
            case 189:
                bj7 bj7Var = new bj7();
                bj7Var.languageHelper = (d04) w91Var.p.get();
                bj7Var.authorizationManager = (i10) w91Var.y.get();
                bj7Var.requestProxy = (x57) w91Var.G.get();
                bj7Var.serverMonitor = (bp7) w91Var.K.get();
                bj7Var.accountManager = (c5) w91Var.L.get();
                bj7Var.context = w91Var.a.a;
                bj7Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                bj7Var.miuiUtils = (fw4) w91Var.M.get();
                bj7Var.googleUtils = (qu2) w91Var.N.get();
                return bj7Var;
            case 190:
                return new yi7((zi7) w91Var.N2.get());
            case 191:
                zi7 zi7Var = new zi7();
                zi7Var.languageHelper = (d04) w91Var.p.get();
                zi7Var.authorizationManager = (i10) w91Var.y.get();
                zi7Var.requestProxy = (x57) w91Var.G.get();
                zi7Var.serverMonitor = (bp7) w91Var.K.get();
                zi7Var.accountManager = (c5) w91Var.L.get();
                zi7Var.context = w91Var.a.a;
                zi7Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                zi7Var.miuiUtils = (fw4) w91Var.M.get();
                zi7Var.googleUtils = (qu2) w91Var.N.get();
                return zi7Var;
            case 192:
                kj7 kj7Var = new kj7();
                kj7Var.languageHelper = (d04) w91Var.p.get();
                kj7Var.authorizationManager = (i10) w91Var.y.get();
                kj7Var.requestProxy = (x57) w91Var.G.get();
                kj7Var.serverMonitor = (bp7) w91Var.K.get();
                kj7Var.accountManager = (c5) w91Var.L.get();
                kj7Var.context = w91Var.a.a;
                kj7Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                kj7Var.miuiUtils = (fw4) w91Var.M.get();
                kj7Var.googleUtils = (qu2) w91Var.N.get();
                return kj7Var;
            case 193:
                mi7 mi7Var = new mi7();
                mi7Var.languageHelper = (d04) w91Var.p.get();
                mi7Var.authorizationManager = (i10) w91Var.y.get();
                mi7Var.requestProxy = (x57) w91Var.G.get();
                mi7Var.serverMonitor = (bp7) w91Var.K.get();
                mi7Var.accountManager = (c5) w91Var.L.get();
                mi7Var.context = w91Var.a.a;
                mi7Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                mi7Var.miuiUtils = (fw4) w91Var.M.get();
                mi7Var.googleUtils = (qu2) w91Var.N.get();
                return mi7Var;
            case 194:
                cv cvVar2 = w91Var.c;
                jb1 jb1Var2 = (jb1) w91Var.i0.get();
                js3.p(jb1Var2, "databaseHelper");
                Dao dao2 = jb1Var2.getDao(SearchHistoryModel.class);
                js3.o(dao2, "getDao(...)");
                return new ds(dao2);
            case 195:
                cv cvVar3 = w91Var.c;
                jb1 jb1Var3 = (jb1) w91Var.i0.get();
                js3.p(jb1Var3, "databaseHelper");
                Dao dao3 = jb1Var3.getDao(MovieSearchHistoryModel.class);
                js3.o(dao3, "getDao(...)");
                return new l65(dao3);
            case 196:
                oj7 oj7Var = new oj7();
                oj7Var.languageHelper = (d04) w91Var.p.get();
                oj7Var.authorizationManager = (i10) w91Var.y.get();
                oj7Var.requestProxy = (x57) w91Var.G.get();
                oj7Var.serverMonitor = (bp7) w91Var.K.get();
                oj7Var.accountManager = (c5) w91Var.L.get();
                oj7Var.context = w91Var.a.a;
                oj7Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                oj7Var.miuiUtils = (fw4) w91Var.M.get();
                oj7Var.googleUtils = (qu2) w91Var.N.get();
                return oj7Var;
            case 197:
                cv cvVar4 = w91Var.c;
                jb1 jb1Var4 = (jb1) w91Var.i0.get();
                js3.p(jb1Var4, "databaseHelper");
                Dao dao4 = jb1Var4.getDao(UserSearchHistoryModel.class);
                js3.o(dao4, "getDao(...)");
                return new w19(dao4);
            case 198:
                hl7 hl7Var = new hl7();
                hl7Var.languageHelper = (d04) w91Var.p.get();
                hl7Var.authorizationManager = (i10) w91Var.y.get();
                hl7Var.requestProxy = (x57) w91Var.G.get();
                hl7Var.serverMonitor = (bp7) w91Var.K.get();
                hl7Var.accountManager = (c5) w91Var.L.get();
                hl7Var.context = w91Var.a.a;
                hl7Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                hl7Var.miuiUtils = (fw4) w91Var.M.get();
                hl7Var.googleUtils = (qu2) w91Var.N.get();
                return hl7Var;
            case 199:
                return new ls0(w91Var.a.a);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.pn6
    public final Object get() {
        int i = this.b;
        int i2 = i / 100;
        w91 w91Var = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                return a();
            }
            if (i2 != 2) {
                throw new AssertionError(i);
            }
            switch (i) {
                case ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR /* 200 */:
                    cv cvVar = w91Var.c;
                    jb1 jb1Var = (jb1) w91Var.i0.get();
                    js3.p(jb1Var, "databaseHelper");
                    Dao dao = jb1Var.getDao(SearchHistoryModel.class);
                    js3.o(dao, "getDao(...)");
                    return new oi7(dao);
                case 201:
                    z68 z68Var = new z68();
                    z68Var.languageHelper = (d04) w91Var.p.get();
                    z68Var.authorizationManager = (i10) w91Var.y.get();
                    z68Var.requestProxy = (x57) w91Var.G.get();
                    z68Var.serverMonitor = (bp7) w91Var.K.get();
                    z68Var.accountManager = (c5) w91Var.L.get();
                    z68Var.context = w91Var.a.a;
                    z68Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                    z68Var.miuiUtils = (fw4) w91Var.M.get();
                    z68Var.googleUtils = (qu2) w91Var.N.get();
                    return z68Var;
                case 202:
                    l78 l78Var = new l78();
                    l78Var.languageHelper = (d04) w91Var.p.get();
                    l78Var.authorizationManager = (i10) w91Var.y.get();
                    l78Var.requestProxy = (x57) w91Var.G.get();
                    l78Var.serverMonitor = (bp7) w91Var.K.get();
                    l78Var.accountManager = (c5) w91Var.L.get();
                    l78Var.context = w91Var.a.a;
                    l78Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                    l78Var.miuiUtils = (fw4) w91Var.M.get();
                    l78Var.googleUtils = (qu2) w91Var.N.get();
                    return l78Var;
                case 203:
                    pb8 pb8Var = new pb8();
                    pb8Var.languageHelper = (d04) w91Var.p.get();
                    pb8Var.authorizationManager = (i10) w91Var.y.get();
                    pb8Var.requestProxy = (x57) w91Var.G.get();
                    pb8Var.serverMonitor = (bp7) w91Var.K.get();
                    pb8Var.accountManager = (c5) w91Var.L.get();
                    pb8Var.context = w91Var.a.a;
                    pb8Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                    pb8Var.miuiUtils = (fw4) w91Var.M.get();
                    pb8Var.googleUtils = (qu2) w91Var.N.get();
                    return pb8Var;
                case 204:
                    return new c09((g76) w91Var.O.get(), (d09) w91Var.b3.get());
                case 205:
                    d09 d09Var = new d09();
                    d09Var.languageHelper = (d04) w91Var.p.get();
                    d09Var.authorizationManager = (i10) w91Var.y.get();
                    d09Var.requestProxy = (x57) w91Var.G.get();
                    d09Var.serverMonitor = (bp7) w91Var.K.get();
                    d09Var.accountManager = (c5) w91Var.L.get();
                    d09Var.context = w91Var.a.a;
                    d09Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                    d09Var.miuiUtils = (fw4) w91Var.M.get();
                    d09Var.googleUtils = (qu2) w91Var.N.get();
                    return d09Var;
                case 206:
                    s19 s19Var = new s19();
                    s19Var.languageHelper = (d04) w91Var.p.get();
                    s19Var.authorizationManager = (i10) w91Var.y.get();
                    s19Var.requestProxy = (x57) w91Var.G.get();
                    s19Var.serverMonitor = (bp7) w91Var.K.get();
                    s19Var.accountManager = (c5) w91Var.L.get();
                    s19Var.context = w91Var.a.a;
                    s19Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                    s19Var.miuiUtils = (fw4) w91Var.M.get();
                    s19Var.googleUtils = (qu2) w91Var.N.get();
                    return s19Var;
                default:
                    throw new AssertionError(i);
            }
        }
        switch (i) {
            case 0:
                dp3 dp3VarA = ep3.a(m4.u(w91Var.a), (t32) w91Var.f.get(), (ps1) w91Var.w.get());
                w91.z(w91Var, dp3VarA);
                return dp3VarA;
            case 1:
                return ep3.A(w91Var.b);
            case 2:
                ps1 ps1VarD = jq0.d((t32) w91Var.f.get(), (qs1) w91Var.g.get(), (wl5) w91Var.i.get(), (ir.mservices.market.version2.manager.serverUrl.downloadserver.a) w91Var.j.get(), m4.w(w91Var.a), (pr7) w91Var.s.get());
                w91.q(w91Var, ps1VarD);
                return ps1VarD;
            case 3:
                return new qs1(m4.w(w91Var.a));
            case 4:
                return new wl5((lu7) w91Var.h.get());
            case 5:
                lu7 lu7VarB = qr7.b();
                w91.R(w91Var, lu7VarB);
                return lu7VarB;
            case 6:
                return new ir.mservices.market.version2.manager.serverUrl.downloadserver.a((lu7) w91Var.h.get());
            case 7:
                pr7 pr7VarA = qr7.a();
                w91.Q(w91Var, pr7VarA);
                return pr7VarA;
            case 8:
                mr7 mr7VarB = te5.b((t32) w91Var.f.get());
                w91.P(w91Var, mr7VarB);
                return mr7VarB;
            case 9:
                return new ee((List) w91Var.n.get());
            case 10:
                return m4.t((tc2) w91Var.l.get(), (ns0) w91Var.m.get());
            case 11:
                return m4.y((FirebaseAnalytics) w91Var.k.get());
            case 12:
                return m4.x(m4.w(w91Var.a));
            case 13:
                return m4.v(m4.w(w91Var.a), (lu7) w91Var.h.get());
            case 14:
                return new d04((lu7) w91Var.h.get());
            case 15:
                return new rf7((dv2) w91Var.q.get(), (lu7) w91Var.h.get());
            case 16:
                return te5.n(w91Var.b, m4.w(w91Var.a));
            case 17:
                return jq0.y(w91Var.c, (t32) w91Var.f.get());
            case 18:
                return new AppUpdateRepositoryImpl((ir.mservices.market.app.update.common.manager.a) w91Var.h0.get(), (ir.mservices.market.app.update.common.manager.b) w91Var.k0.get(), (ps1) w91Var.w.get(), (dp3) w91Var.v.get());
            case 19:
                return new ir.mservices.market.app.update.common.manager.a((dp3) w91Var.v.get(), (lu7) w91Var.h.get(), (ir.mservices.market.core.notification.a) w91Var.T.get(), (qz8) w91Var.e0.get(), w91Var.J0(), (jz8) w91Var.g0.get());
            case 20:
                ir.mservices.market.core.notification.a aVarD = te5.d(m4.w(w91Var.a), (t32) w91Var.f.get(), (ps1) w91Var.w.get(), (ir.mservices.market.version2.manager.install.a) w91Var.x.get());
                w91.I(w91Var, aVarD);
                return aVarD;
            case 21:
                ir.mservices.market.version2.manager.install.a aVarZ = ep3.z();
                w91.A(w91Var, aVarZ);
                return aVarZ;
            case 22:
                return new xf5(m4.w(w91Var.a), dr1.a(w91Var.v), (i10) w91Var.y.get(), (dv2) w91Var.q.get(), (lu7) w91Var.h.get(), dr1.a(w91Var.D), (lw8) w91Var.E.get());
            case 23:
                i10 i10VarA = m4.a();
                w91.g(w91Var, i10VarA);
                return i10VarA;
            case 24:
                return new ir.mservices.market.version2.manager.a(m4.w(w91Var.a), (ps1) w91Var.w.get(), (wt) w91Var.z.get(), (dp3) w91Var.v.get(), (lu7) w91Var.h.get(), (ir.mservices.market.version2.manager.install.a) w91Var.x.get(), (b56) w91Var.A.get(), (ec9) w91Var.C.get(), (t32) w91Var.f.get());
            case 25:
                return new b56();
            case 26:
                return new ec9((kb9) w91Var.B.get(), m4.w(w91Var.a));
            case 27:
                return new lb9();
            case 28:
                return te5.p(w91Var.b, m4.w(w91Var.a));
            case 29:
                x57 x57VarA = te5.a(m4.w(w91Var.a));
                w91.N(w91Var, x57VarA);
                return x57VarA;
            case 30:
                return new n25((ir.mservices.market.movie.download.core.source.a) w91Var.Z.get());
            case 31:
                return new ir.mservices.market.movie.download.core.source.a((xl5) w91Var.X.get(), (xf5) w91Var.F.get(), (MovieDownloadUrlService) w91Var.Y.get(), (f85) w91Var.H.get(), (k68) w91Var.V.get(), (ir.mservices.market.core.notification.a) w91Var.T.get());
            case 32:
                return jq0.x(w91Var.d, m4.w(w91Var.a), (k25) w91Var.I.get(), (ir.mservices.market.movie.download.core.a) w91Var.W.get(), (qs1) w91Var.g.get());
            case 33:
                return new k25((f85) w91Var.H.get());
            case 34:
                return new f85();
            case 35:
                return new ir.mservices.market.movie.download.core.a((d) w91Var.S.get(), (c5) w91Var.L.get(), (k68) w91Var.V.get(), (b56) w91Var.A.get(), m4.w(w91Var.a));
            case 36:
                d dVar = new d();
                w91.w(w91Var, dVar);
                return dVar;
            case 37:
                bp7 bp7Var = new bp7((ir.mservices.market.version2.manager.serverUrl.a) w91Var.J.get(), (t32) w91Var.f.get());
                bp7Var.g = w91Var.a.a;
                return bp7Var;
            case 38:
                return new ir.mservices.market.version2.manager.serverUrl.a((lu7) w91Var.h.get());
            case 39:
                c5 c5Var = new c5((lu7) w91Var.h.get(), m4.w(w91Var.a), (t32) w91Var.f.get());
                w91.d(w91Var, c5Var);
                return c5Var;
            case 40:
                ir.mservices.market.version2.services.b bVar = new ir.mservices.market.version2.services.b();
                w91.e(w91Var, bVar);
                return bVar;
            case 41:
                w91Var.b.getClass();
                return new fw4();
            case 42:
                rl3 rl3Var = w91Var.b;
                Context contextW = m4.w(w91Var.a);
                rl3Var.getClass();
                return new qu2(contextW);
            case 43:
                g76 g76Var = new g76();
                g76Var.a = w91Var.a.a;
                g76Var.b = (lu7) w91Var.h.get();
                return g76Var;
            case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                return new ir.mservices.market.common.model.a(m4.w(w91Var.a), (ww0) w91Var.Q.get(), (c5) w91Var.L.get(), (fw4) w91Var.M.get());
            case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                ww0 ww0Var = new ww0();
                w91.l(w91Var, ww0Var);
                return ww0Var;
            case 46:
                return new k68((lu7) w91Var.h.get(), m4.w(w91Var.a), (d56) w91Var.U.get(), (fw4) w91Var.M.get());
            case 47:
                return new d56((b56) w91Var.A.get(), (lu7) w91Var.h.get(), dr1.a(w91Var.T), w91Var.D0());
            case 48:
                MovieDownloadUrlService movieDownloadUrlServiceNewInstance = MovieDownloadUrlService_Factory.newInstance();
                w91.F(w91Var, movieDownloadUrlServiceNewInstance);
                return movieDownloadUrlServiceNewInstance;
            case 49:
                return new f(w91Var.a.a, (ps1) w91Var.w.get(), dr1.a(w91Var.D), dr1.a(w91Var.v), (ir.mservices.market.version2.manager.install.a) w91Var.x.get(), (fw4) w91Var.M.get(), dr1.a(w91Var.T), (ti6) w91Var.b0.get(), dr1.a(w91Var.z));
            case 50:
                ti6 ti6Var = new ti6();
                ti6Var.languageHelper = (d04) w91Var.p.get();
                ti6Var.authorizationManager = (i10) w91Var.y.get();
                ti6Var.requestProxy = (x57) w91Var.G.get();
                ti6Var.serverMonitor = (bp7) w91Var.K.get();
                ti6Var.accountManager = (c5) w91Var.L.get();
                ti6Var.context = w91Var.a.a;
                ti6Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                ti6Var.miuiUtils = (fw4) w91Var.M.get();
                ti6Var.googleUtils = (qu2) w91Var.N.get();
                return ti6Var;
            case 51:
                return new qz8(w91Var.a.a, (AlarmManager) w91Var.d0.get(), (ir.mservices.market.core.notification.a) w91Var.T.get(), (lu7) w91Var.h.get(), (d04) w91Var.p.get());
            case 52:
                rl3 rl3Var2 = w91Var.b;
                Object systemService = ContextCompat.getSystemService(w91Var.a.a, AlarmManager.class);
                js3.n(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                return (AlarmManager) systemService;
            case 53:
                uz8 uz8Var = new uz8();
                uz8Var.languageHelper = (d04) w91Var.p.get();
                uz8Var.authorizationManager = (i10) w91Var.y.get();
                uz8Var.requestProxy = (x57) w91Var.G.get();
                uz8Var.serverMonitor = (bp7) w91Var.K.get();
                uz8Var.accountManager = (c5) w91Var.L.get();
                uz8Var.context = w91Var.a.a;
                uz8Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                uz8Var.miuiUtils = (fw4) w91Var.M.get();
                uz8Var.googleUtils = (qu2) w91Var.N.get();
                return uz8Var;
            case 54:
                return new jz8((lu7) w91Var.h.get());
            case 55:
                return new ir.mservices.market.app.update.common.manager.b((oz8) w91Var.j0.get(), w91Var.a.a);
            case 56:
                cv cvVar2 = w91Var.c;
                jb1 jb1Var2 = (jb1) w91Var.i0.get();
                js3.p(jb1Var2, "databaseHelper");
                Dao dao2 = jb1Var2.getDao(InActiveAppUpdateModel.class);
                js3.o(dao2, "getDao(...)");
                return new oz8(dao2);
            case 57:
                cv cvVar3 = w91Var.c;
                return new jb1(w91Var.a.a, "Myket.db", null, 66);
            case 58:
                c cVar = new c();
                cVar.languageHelper = (d04) w91Var.p.get();
                cVar.authorizationManager = (i10) w91Var.y.get();
                cVar.requestProxy = (x57) w91Var.G.get();
                cVar.serverMonitor = (bp7) w91Var.K.get();
                cVar.accountManager = (c5) w91Var.L.get();
                cVar.context = w91Var.a.a;
                cVar.sharedPreferencesProxy = (lu7) w91Var.h.get();
                cVar.miuiUtils = (fw4) w91Var.M.get();
                cVar.googleUtils = (qu2) w91Var.N.get();
                cVar.a = dr1.a(w91Var.T);
                return cVar;
            case 59:
                return new dx4((dp3) w91Var.v.get());
            case 60:
                return new ir.mservices.market.common.install.a(w91Var.a.a, (dp3) w91Var.v.get());
            case 61:
                co6 co6Var = new co6();
                co6Var.a = (ir.mservices.market.core.notification.a) w91Var.T.get();
                co6Var.b = (zt) w91Var.q0.get();
                co6Var.c = (kp7) w91Var.r0.get();
                co6Var.d = (pp8) w91Var.s0.get();
                co6Var.e = (eg5) w91Var.t0.get();
                co6Var.f = (lu7) w91Var.h.get();
                co6Var.g = (ir.mservices.market.app.update.common.manager.a) w91Var.h0.get();
                co6Var.h = w91Var.I0();
                co6Var.i = (wt) w91Var.z.get();
                co6Var.j = (c) w91Var.l0.get();
                co6Var.k = (dp3) w91Var.v.get();
                co6Var.l = (rf7) w91Var.r.get();
                co6Var.m = (ir.mservices.market.version2.manager.a) w91Var.D.get();
                co6Var.n = (ul3) w91Var.v0.get();
                co6Var.o = (d56) w91Var.U.get();
                co6Var.p = (b56) w91Var.A.get();
                return co6Var;
            case 62:
                zt ztVar = new zt(w91Var.a.a);
                ztVar.d = (lu7) w91Var.h.get();
                ztVar.e = (nu7) w91Var.p0.get();
                ztVar.f = (vl8) w91Var.o0.get();
                ztVar.l = w91Var.I0();
                return ztVar;
            case 63:
                nu7 nu7Var = new nu7();
                nu7Var.a = (lu7) w91Var.h.get();
                nu7Var.b = (vl8) w91Var.o0.get();
                return nu7Var;
            case 64:
                rl3 rl3Var3 = w91Var.b;
                Context context = w91Var.a.a;
                lw8 lw8Var = (lw8) w91Var.E.get();
                js3.p(lw8Var, "uiUtils");
                return new vl8(lw8Var, context);
            case 65:
                kp7 kp7Var = new kp7(w91Var.a.a);
                kp7Var.d = (lu7) w91Var.h.get();
                kp7Var.e = (nu7) w91Var.p0.get();
                kp7Var.f = (vl8) w91Var.o0.get();
                kp7Var.l = (d) w91Var.S.get();
                kp7Var.m = (ir.mservices.market.version2.manager.serverUrl.a) w91Var.J.get();
                return kp7Var;
            case 66:
                pp8 pp8Var = new pp8(w91Var.a.a);
                pp8Var.d = (lu7) w91Var.h.get();
                pp8Var.e = (nu7) w91Var.p0.get();
                pp8Var.f = (vl8) w91Var.o0.get();
                pp8Var.l = (d) w91Var.S.get();
                pp8Var.m = (wl5) w91Var.i.get();
                return pp8Var;
            case 67:
                eg5 eg5Var = new eg5(w91Var.a.a);
                eg5Var.m = -1;
                eg5Var.n = false;
                eg5Var.d = (lu7) w91Var.h.get();
                eg5Var.e = (nu7) w91Var.p0.get();
                eg5Var.f = (vl8) w91Var.o0.get();
                eg5Var.l = (d) w91Var.S.get();
                return eg5Var;
            case 68:
                ul3 ul3Var = new ul3((lu7) w91Var.h.get(), (jl3) w91Var.u0.get());
                ul3Var.a = (ir.mservices.market.core.notification.a) w91Var.T.get();
                return ul3Var;
            case 69:
                cv cvVar4 = w91Var.c;
                jb1 jb1Var3 = (jb1) w91Var.i0.get();
                js3.p(jb1Var3, "databaseHelper");
                return new jl3(jb1Var3.getDao(InboxInfoModel.class));
            case 70:
                op5 op5Var = new op5();
                op5Var.languageHelper = (d04) w91Var.p.get();
                op5Var.authorizationManager = (i10) w91Var.y.get();
                op5Var.requestProxy = (x57) w91Var.G.get();
                op5Var.serverMonitor = (bp7) w91Var.K.get();
                op5Var.accountManager = (c5) w91Var.L.get();
                op5Var.context = w91Var.a.a;
                op5Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                op5Var.miuiUtils = (fw4) w91Var.M.get();
                op5Var.googleUtils = (qu2) w91Var.N.get();
                return op5Var;
            case 71:
                ct ctVar = new ct();
                ctVar.languageHelper = (d04) w91Var.p.get();
                ctVar.authorizationManager = (i10) w91Var.y.get();
                ctVar.requestProxy = (x57) w91Var.G.get();
                ctVar.serverMonitor = (bp7) w91Var.K.get();
                ctVar.accountManager = (c5) w91Var.L.get();
                ctVar.context = w91Var.a.a;
                ctVar.sharedPreferencesProxy = (lu7) w91Var.h.get();
                ctVar.miuiUtils = (fw4) w91Var.M.get();
                ctVar.googleUtils = (qu2) w91Var.N.get();
                return ctVar;
            case 72:
                return new ir.mservices.market.version2.manager.d((j85) w91Var.z0.get());
            case 73:
                cv cvVar5 = w91Var.c;
                jb1 jb1Var4 = (jb1) w91Var.i0.get();
                js3.p(jb1Var4, "databaseHelper");
                Dao dao3 = jb1Var4.getDao(MovieWatchProgressModel.class);
                js3.o(dao3, "getDao(...)");
                return new j85(dao3);
            case 74:
                return new du((ps1) w91Var.w.get(), (dp3) w91Var.v.get(), (ir.mservices.market.version2.manager.a) w91Var.D.get());
            case 75:
                Context context2 = w91Var.a.a;
                return new ee5();
            case 76:
                return new yl5((ps1) w91Var.w.get());
            case 77:
                return new ir.mservices.market.version2.manager.b(w91Var.a.a);
            case 78:
                return new pi0((t32) w91Var.f.get());
            case 79:
                az8 az8Var = new az8();
                az8Var.a = (ee) w91Var.o.get();
                return az8Var;
            case 80:
                return new qa3((ee) w91Var.o.get());
            case 81:
                f65 f65Var = new f65();
                f65Var.a = (ee) w91Var.o.get();
                return f65Var;
            case 82:
                return new x07(w91Var.a.a);
            case 83:
                gp7 gp7Var = new gp7();
                gp7Var.i = false;
                gp7Var.a = (eg5) w91Var.t0.get();
                gp7Var.b = (kp7) w91Var.r0.get();
                gp7Var.c = (pp8) w91Var.s0.get();
                gp7Var.d = (nu7) w91Var.p0.get();
                gp7Var.e = (d27) w91Var.K0.get();
                gp7Var.f = (yo3) w91Var.N0.get();
                gp7Var.g = (hx2) w91Var.P0.get();
                gp7Var.h = (du2) w91Var.Q0.get();
                return gp7Var;
            case 84:
                d27 d27Var = new d27(w91Var.a.a);
                d27Var.d = (lu7) w91Var.h.get();
                d27Var.e = (nu7) w91Var.p0.get();
                d27Var.f = (vl8) w91Var.o0.get();
                d27Var.l = (ir.mservices.market.version2.services.b) w91Var.P.get();
                d27Var.m = (c5) w91Var.L.get();
                d27Var.n = (ee) w91Var.o.get();
                d27Var.o = (lu7) w91Var.h.get();
                return d27Var;
            case 85:
                yo3 yo3Var = new yo3(w91Var.a.a);
                yo3Var.d = (lu7) w91Var.h.get();
                yo3Var.e = (nu7) w91Var.p0.get();
                yo3Var.f = (vl8) w91Var.o0.get();
                yo3Var.l = (p09) w91Var.M0.get();
                return yo3Var;
            case 86:
                return new p09((o09) w91Var.L0.get());
            case 87:
                cv cvVar6 = w91Var.c;
                jb1 jb1Var5 = (jb1) w91Var.i0.get();
                js3.p(jb1Var5, "databaseHelper");
                return new o09(jb1Var5.getDao(CallbackUrlModel.class));
            case 88:
                hx2 hx2Var = new hx2(w91Var.a.a);
                hx2Var.d = (lu7) w91Var.h.get();
                hx2Var.e = (nu7) w91Var.p0.get();
                hx2Var.f = (vl8) w91Var.o0.get();
                hx2Var.l = (ix2) w91Var.O0.get();
                hx2Var.m = (dp3) w91Var.v.get();
                return hx2Var;
            case 89:
                ix2 ix2Var = new ix2();
                ix2Var.languageHelper = (d04) w91Var.p.get();
                ix2Var.authorizationManager = (i10) w91Var.y.get();
                ix2Var.requestProxy = (x57) w91Var.G.get();
                ix2Var.serverMonitor = (bp7) w91Var.K.get();
                ix2Var.accountManager = (c5) w91Var.L.get();
                ix2Var.context = w91Var.a.a;
                ix2Var.sharedPreferencesProxy = (lu7) w91Var.h.get();
                ix2Var.miuiUtils = (fw4) w91Var.M.get();
                ix2Var.googleUtils = (qu2) w91Var.N.get();
                return ix2Var;
            case 90:
                du2 du2Var = new du2(w91Var.a.a);
                du2Var.d = (lu7) w91Var.h.get();
                du2Var.e = (nu7) w91Var.p0.get();
                du2Var.f = (vl8) w91Var.o0.get();
                du2Var.l = (qu2) w91Var.N.get();
                return du2Var;
            case 91:
                t32 t32Var = (t32) w91Var.f.get();
                hf5 hf5Var = new hf5();
                t32Var.l(hf5Var, false);
                hf5Var.b = w91Var.a.a;
                hf5Var.c = (c5) w91Var.L.get();
                return hf5Var;
            case 92:
                zv5 zv5Var = new zv5();
                zv5Var.a = w91Var.a.a;
                return zv5Var;
            case 93:
                Application applicationO = m91.o(w91Var.a.a);
                t32 t32Var2 = (t32) w91Var.f.get();
                go6 go6Var = new go6();
                go6Var.a = false;
                t32Var2.l(go6Var, false);
                applicationO.getApplicationContext();
                applicationO.registerActivityLifecycleCallbacks(go6Var);
                go6Var.b = (c5) w91Var.L.get();
                go6Var.c = (lu7) w91Var.h.get();
                go6Var.d = (op5) w91Var.w0.get();
                go6Var.e = (qu2) w91Var.N.get();
                return go6Var;
            case 94:
                fv fvVar = w91Var.d;
                ps1 ps1Var = (ps1) w91Var.w.get();
                xl5 xl5Var = (xl5) w91Var.X.get();
                lu7 lu7Var = (lu7) w91Var.h.get();
                d dVar2 = (d) w91Var.S.get();
                c5 c5Var2 = (c5) w91Var.L.get();
                js3.p(ps1Var, "downloadManager");
                js3.p(xl5Var, "nene");
                js3.p(lu7Var, "sharedPreferencesProxy");
                js3.p(dVar2, "generalService");
                js3.p(c5Var2, "accountManager");
                return new u28(ps1Var, xl5Var, lu7Var, dVar2, c5Var2);
            case 95:
                xr1 xr1Var = new xr1((ps1) w91Var.w.get());
                xr1Var.a = w91Var.a.a;
                xr1Var.b = (ee) w91Var.o.get();
                xr1Var.c = (wt) w91Var.z.get();
                return xr1Var;
            case 96:
                return new hs1((ps1) w91Var.w.get(), (ir.mservices.market.version2.manager.a) w91Var.D.get());
            case 97:
                js3.p((ee) w91Var.o.get(), "analyticsService");
                return new tj5();
            case 98:
                er3 er3Var = new er3();
                er3Var.a = (ir.mservices.market.core.notification.a) w91Var.T.get();
                er3Var.b = (c5) w91Var.L.get();
                er3Var.c = (bu7) w91Var.Z0.get();
                er3Var.d = (d) w91Var.S.get();
                er3Var.e = (qu2) w91Var.N.get();
                er3Var.f = w91Var.D0();
                er3Var.g = (ir.mservices.market.version2.manager.install.a) w91Var.x.get();
                er3Var.h = (co6) w91Var.x0.get();
                return er3Var;
            case 99:
                return new bu7((k68) w91Var.V.get());
            default:
                throw new AssertionError(i);
        }
    }
}
