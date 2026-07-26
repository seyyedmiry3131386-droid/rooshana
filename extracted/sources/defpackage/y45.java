package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment;
import ir.mservices.market.pika.receive.recycler.ReceivedAppData;
import ir.mservices.market.pika.receive.recycler.a;
import ir.mservices.market.setting.SettingRecyclerListFragment;
import ir.mservices.market.setting.recycler.SettingSimpleData;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;
import ir.myket.player.provider.service.PlaybackService;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y45 implements gb8, h32, ph3, yp2, pq1, ms5, cg1, og5, fr1, ob7, n31, pg5 {
    public final /* synthetic */ int a;

    public /* synthetic */ y45(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ TextClassifier f(Object obj) {
        return (TextClassifier) obj;
    }

    @Override // defpackage.pg5
    public void a(View view, qg5 qg5Var, Object obj) {
        int i = SettingRecyclerListFragment.k1;
        js3.p((SettingSimpleData) obj, "recyclerData");
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        ((mc7) obj).b.a();
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return (vo8) obj;
            default:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        wv8 wv8VarA = d30.a();
                        wv8VarA.L(cursorRawQuery.getString(1));
                        wv8VarA.d = gk6.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        wv8VarA.b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(wv8VarA.l());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
        }
    }

    @Override // defpackage.cg1
    public void b(jq4 jq4Var) {
        int i = PlaybackService.k;
        js3.p(jq4Var, "it");
    }

    @Override // defpackage.ph3
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // defpackage.fr1
    public double d(double d) {
        return d;
    }

    @Override // defpackage.pq1
    public List g(String str) throws UnknownHostException {
        Object objA;
        js3.p(str, "hostname");
        try {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                js3.o(allByName, "getAllByName(...)");
                objA = ew.X0(allByName);
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (Result.a(objA) != null) {
            try {
                InetAddress[] allByName2 = InetAddress.getAllByName(str);
                js3.o(allByName2, "getAllByName(...)");
                objA = ew.X0(allByName2);
            } catch (NullPointerException e2) {
                UnknownHostException unknownHostException2 = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException2.initCause(e2);
                throw unknownHostException2;
            }
        }
        return (List) objA;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        ReceivedAppData receivedAppData = (ReceivedAppData) obj;
        int i = ReceiveAppRecyclerListFragment.p1;
        js3.p(view, "<unused var>");
        js3.p((a) qg5Var, "<unused var>");
        js3.p(receivedAppData, "recyclerData");
        dp3.M(receivedAppData.b);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        int i = PagingRecyclerListContentFragment.e1;
        js3.p(view, "bottomInsetView");
        view.getLayoutParams().height = view.getResources().getDimensionPixelSize(pq6.space_16) + lf9Var.a.g(2).d;
        return lf9Var;
    }
}
