package defpackage;

import androidx.room.a;
import androidx.room.h;
import ir.myket.persistent.db.MyketDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class he5 extends vz1 {
    public final /* synthetic */ MyketDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he5(MyketDatabase_Impl myketDatabase_Impl) {
        super(1, "d1ffed7409ba26daaa64d2ca8c033418", "0623009b9eb19e3aa9bbbdc4190e1fab");
        this.d = myketDatabase_Impl;
    }

    @Override // defpackage.vz1
    public final void a(mb7 mb7Var) throws Exception {
        js3.p(mb7Var, "connection");
        ln2.d(mb7Var, "CREATE TABLE IF NOT EXISTS `movie_watch_progress` (`play_id` TEXT NOT NULL, `movie_id` TEXT NOT NULL, `watched_time` INTEGER NOT NULL, `movie_total_time` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`play_id`))");
        ln2.d(mb7Var, "CREATE TABLE IF NOT EXISTS `callback_url` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT NOT NULL, `type` TEXT NOT NULL, `retry_count` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL)");
        ln2.d(mb7Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_callback_url_url` ON `callback_url` (`url`)");
        ln2.d(mb7Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ln2.d(mb7Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd1ffed7409ba26daaa64d2ca8c033418')");
    }

    @Override // defpackage.vz1
    public final void c(mb7 mb7Var) throws Exception {
        js3.p(mb7Var, "connection");
        ln2.d(mb7Var, "DROP TABLE IF EXISTS `movie_watch_progress`");
        ln2.d(mb7Var, "DROP TABLE IF EXISTS `callback_url`");
    }

    @Override // defpackage.vz1
    public final void r(mb7 mb7Var) {
        js3.p(mb7Var, "connection");
    }

    @Override // defpackage.vz1
    public final void s(mb7 mb7Var) throws Exception {
        js3.p(mb7Var, "connection");
        a aVarD = this.d.d();
        h hVar = aVarD.b;
        hVar.getClass();
        rb7 rb7VarM1 = mb7Var.m1("PRAGMA query_only");
        try {
            rb7VarM1.f1();
            boolean zA0 = rb7VarM1.a0();
            m91.i(rb7VarM1, null);
            if (!zA0) {
                ln2.d(mb7Var, "PRAGMA temp_store = MEMORY");
                ln2.d(mb7Var, "PRAGMA recursive_triggers = 1");
                ln2.d(mb7Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (hVar.d) {
                    ln2.d(mb7Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    ln2.d(mb7Var, m88.X("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                hr5 hr5Var = hVar.h;
                ReentrantLock reentrantLock = hr5Var.a;
                reentrantLock.lock();
                try {
                    hr5Var.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (aVarD.g) {
            }
        } finally {
        }
    }

    @Override // defpackage.vz1
    public final void t(mb7 mb7Var) {
        js3.p(mb7Var, "connection");
    }

    @Override // defpackage.vz1
    public final void u(mb7 mb7Var) throws Exception {
        js3.p(mb7Var, "connection");
        ListBuilder listBuilderS = br9.s();
        rb7 rb7VarM1 = mb7Var.m1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (rb7VarM1.f1()) {
            try {
                listBuilderS.add(rb7VarM1.B0(0));
            } finally {
            }
        }
        m91.i(rb7VarM1, null);
        ListIterator listIterator = br9.q(listBuilderS).listIterator(0);
        while (true) {
            rz2 rz2Var = (rz2) listIterator;
            if (!rz2Var.hasNext()) {
                return;
            }
            String str = (String) rz2Var.next();
            if (m88.Z(str, "room_fts_content_sync_", false)) {
                ln2.d(mb7Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // defpackage.vz1
    public final xe1 v(mb7 mb7Var) throws Exception {
        js3.p(mb7Var, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("play_id", new ie8(1, 1, "play_id", "TEXT", null, true));
        linkedHashMap.put("movie_id", new ie8(0, 1, "movie_id", "TEXT", null, true));
        linkedHashMap.put("watched_time", new ie8(0, 1, "watched_time", "INTEGER", null, true));
        linkedHashMap.put("movie_total_time", new ie8(0, 1, "movie_total_time", "INTEGER", null, true));
        linkedHashMap.put("timestamp", new ie8(0, 1, "timestamp", "INTEGER", null, true));
        le8 le8Var = new le8("movie_watch_progress", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        le8 le8VarK = z27.k(mb7Var, "movie_watch_progress");
        if (!le8Var.equals(le8VarK)) {
            return new xe1(false, "movie_watch_progress(ir.myket.persistent.entities.player.MovieWatchProgressEntity).\n Expected:\n" + le8Var + "\n Found:\n" + le8VarK);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new ie8(1, 1, "id", "INTEGER", null, true));
        linkedHashMap2.put("url", new ie8(0, 1, "url", "TEXT", null, true));
        linkedHashMap2.put("type", new ie8(0, 1, "type", "TEXT", null, true));
        linkedHashMap2.put("retry_count", new ie8(0, 1, "retry_count", "INTEGER", null, true));
        linkedHashMap2.put("timestamp", new ie8(0, 1, "timestamp", "INTEGER", null, true));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new ke8("index_callback_url_url", true, br9.B("url"), br9.B("ASC")));
        le8 le8Var2 = new le8("callback_url", linkedHashMap2, linkedHashSet, linkedHashSet2);
        le8 le8VarK2 = z27.k(mb7Var, "callback_url");
        if (le8Var2.equals(le8VarK2)) {
            return new xe1(true, (String) null);
        }
        return new xe1(false, "callback_url(ir.myket.persistent.entities.callback.CallbackUrlEntity).\n Expected:\n" + le8Var2 + "\n Found:\n" + le8VarK2);
    }
}
