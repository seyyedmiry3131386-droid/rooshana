package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.j256.ormlite.android.AndroidDatabaseConnection;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableUtils;
import ir.mservices.market.search.history.model.SearchHistoryModel;
import ir.mservices.market.version2.model.BindHistoryModel;
import ir.mservices.market.version2.model.CallbackUrlModel;
import ir.mservices.market.version2.model.InActiveAppUpdateModel;
import ir.mservices.market.version2.model.InboxInfoModel;
import ir.mservices.market.version2.model.InboxModel;
import ir.mservices.market.version2.model.MovieSearchHistoryModel;
import ir.mservices.market.version2.model.MovieWatchProgressModel;
import ir.mservices.market.version2.model.UserSearchHistoryModel;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes3.dex */
public final class jb1 extends OrmLiteSqliteOpenHelper {
    public final void b(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.dropTable(connectionSource, InboxModel.class, true);
            TableUtils.dropTable(connectionSource, BindHistoryModel.class, true);
            TableUtils.dropTable(connectionSource, InboxInfoModel.class, true);
            TableUtils.dropTable(connectionSource, SearchHistoryModel.class, true);
            TableUtils.dropTable(connectionSource, MovieSearchHistoryModel.class, true);
            TableUtils.dropTable(connectionSource, CallbackUrlModel.class, true);
            TableUtils.dropTable(connectionSource, MovieWatchProgressModel.class, true);
            TableUtils.dropTable(connectionSource, UserSearchHistoryModel.class, true);
            TableUtils.dropTable(connectionSource, InActiveAppUpdateModel.class, true);
        } catch (SQLException e) {
            lw.g(e, "Can't drop table", null);
        }
        onCreate(sQLiteDatabase, connectionSource);
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
    public final Dao getDao(Class cls) {
        try {
            return super.getDao(cls);
        } catch (SQLException e) {
            lw.g(e, null, null);
            return null;
        }
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, InboxModel.class);
            TableUtils.createTable(connectionSource, BindHistoryModel.class);
            TableUtils.createTable(connectionSource, InboxInfoModel.class);
            TableUtils.createTable(connectionSource, SearchHistoryModel.class);
            TableUtils.createTable(connectionSource, MovieSearchHistoryModel.class);
            TableUtils.createTable(connectionSource, CallbackUrlModel.class);
            TableUtils.createTable(connectionSource, MovieWatchProgressModel.class);
            TableUtils.createTable(connectionSource, UserSearchHistoryModel.class);
            TableUtils.createTable(connectionSource, InActiveAppUpdateModel.class);
        } catch (SQLException e) {
            lw.g(e, "Can't create table", null);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        ConnectionSource connectionSource = getConnectionSource();
        DatabaseConnection specialConnection = connectionSource.getSpecialConnection(null);
        if (specialConnection == null) {
            z = true;
            specialConnection = new AndroidDatabaseConnection(sQLiteDatabase, true, this.cancelQueriesEnabled);
            try {
                connectionSource.saveSpecialConnection(specialConnection);
            } catch (SQLException e) {
                throw new IllegalStateException("Could not save special connection", e);
            }
        } else {
            z = false;
        }
        try {
            b(sQLiteDatabase, connectionSource);
        } finally {
            if (z) {
                connectionSource.clearSpecialConnection(specialConnection);
            }
        }
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource, int i, int i2) {
        if (i < 32) {
            try {
                TableUtils.dropTable(connectionSource, InboxModel.class, true);
            } catch (SQLException e) {
                lw.g(e, "Can't drop table", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
            onCreate(sQLiteDatabase, connectionSource);
            return;
        }
        if (i < 36) {
            try {
                TableUtils.createTable(connectionSource, BindHistoryModel.class);
            } catch (SQLException e2) {
                lw.g(e2, "Can't upgrade database", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 38) {
            try {
                TableUtils.createTable(connectionSource, InboxInfoModel.class);
            } catch (SQLException e3) {
                lw.g(e3, "Can't upgrade database", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 43) {
            try {
                TableUtils.createTable(connectionSource, SearchHistoryModel.class);
            } catch (SQLException e4) {
                lw.g(e4, "Can't create Search History database", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 45) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE UpdateFilteredApp;");
            } catch (android.database.SQLException e5) {
                lw.g(e5, "Can't remove UpdateFilteredApp", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 46) {
            try {
                TableUtils.createTable(connectionSource, CallbackUrlModel.class);
            } catch (SQLException e6) {
                lw.g(e6, "Can't create UrlCallback table", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 48) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE DeviceApps;");
            } catch (android.database.SQLException e7) {
                lw.g(e7, "Can't remove DeviceApps", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 49) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE DownloadApp ADD COLUMN splitNames TEXT;");
            } catch (android.database.SQLException e8) {
                lw.g(e8, "Can't add column to download app", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 50) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE ApplicationInfo ADD COLUMN downloadRef TEXT;");
                sQLiteDatabase.execSQL("ALTER TABLE ApplicationInfo ADD COLUMN launchScenario TEXT;");
            } catch (android.database.SQLException e9) {
                lw.g(e9, "Can't add column to ApplicationInfo", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 51) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE SplashInfo;");
            } catch (android.database.SQLException e10) {
                lw.g(e10, "Can't remove SplashInfo", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 52) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE ApplicationInfo ADD COLUMN category TEXT;");
            } catch (android.database.SQLException e11) {
                lw.g(e11, "Can't add column to ApplicationInfo", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 54) {
            try {
                TableUtils.createTable(connectionSource, MovieSearchHistoryModel.class);
            } catch (android.database.SQLException | SQLException e12) {
                lw.g(e12, "Can't upgrade MovieSearchHistoryModel", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 55) {
            try {
                TableUtils.createTable(connectionSource, MovieWatchProgressModel.class);
            } catch (android.database.SQLException | SQLException e13) {
                lw.g(e13, "Can't upgrade MovieWatchProgressModel", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 56) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE ApplicationInfo ADD COLUMN fuFileLength INTEGER;");
                sQLiteDatabase.execSQL("ALTER TABLE ApplicationInfo ADD COLUMN fuDescription TEXT;");
            } catch (android.database.SQLException e14) {
                lw.g(e14, "Can't add column to ApplicationInfo, forceUpdate", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 57) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE Translation;");
            } catch (android.database.SQLException e15) {
                lw.g(e15, "Can't remove Translation", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 58) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE UrlCallback ADD COLUMN type TEXT;");
            } catch (android.database.SQLException e16) {
                lw.g(e16, "Can't add type column to CallbackUrlModel", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 59) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE ScheduledDownloadApp;");
            } catch (android.database.SQLException e17) {
                lw.g(e17, "Can't drop ScheduledDownloadApp", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 60) {
            try {
                TableUtils.dropTable(connectionSource, CallbackUrlModel.class, true);
                TableUtils.createTable(connectionSource, CallbackUrlModel.class);
            } catch (SQLException e18) {
                lw.g(e18, "Can't upgrade UrlCallback table", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 61) {
            try {
                TableUtils.createTable(connectionSource, UserSearchHistoryModel.class);
            } catch (SQLException e19) {
                lw.g(e19, "Can't Create UserSearchHistoryModel table", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 62) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE recent_apps;");
            } catch (android.database.SQLException e20) {
                lw.g(e20, "Can't drop recent_apps", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 63) {
            try {
                TableUtils.createTable(connectionSource, InActiveAppUpdateModel.class);
            } catch (SQLException e21) {
                lw.g(e21, "Can't Create InActiveAppUpdateModel table", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 64) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE AvailableAppUpdate;");
            } catch (android.database.SQLException e22) {
                lw.g(e22, "Can't drop AvailableAppUpdate", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 65) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE ApplicationInfo;");
                sQLiteDatabase.execSQL("DROP TABLE DownloadApp;");
            } catch (android.database.SQLException e23) {
                lw.g(e23, "Can't drop download", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i < 66) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE InstalledApp;");
            } catch (android.database.SQLException e24) {
                lw.g(e24, "Can't drop InstalledApp", dw1.j(i, i2, "oldVersion:", ", newVersion:"));
            }
        }
        if (i >= 66) {
            lw.g(null, "Database version increased, but upgrade to new version is not implemented.", null);
            b(sQLiteDatabase, connectionSource);
        }
    }
}
