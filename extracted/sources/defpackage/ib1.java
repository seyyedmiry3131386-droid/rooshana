package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import com.j256.ormlite.field.FieldType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import nene.downloadmanager.exceptions.NeneException;
import nene.downloadmanager.exceptions.NeneRuntimeException;

/* JADX INFO: loaded from: classes3.dex */
public class ib1 extends SQLiteOpenHelper {
    public static final String[] b;
    public boolean a;

    static {
        eh5.a("DatabaseHelper");
        b = new String[]{FieldType.FOREIGN_ID_FIELD_SUFFIX, "sourceUrl", "destFilePath", "key", "tag", "status", "detailedStatus", "serverSize", "localSize", "timestamp"};
    }

    public ib1(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 6);
        this.a = false;
    }

    public static ContentValues g(es1 es1Var) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ContentValues contentValues = new ContentValues();
        String[] strArr = b;
        contentValues.put(strArr[0], Integer.valueOf(es1Var.a));
        contentValues.put(strArr[1], es1Var.b);
        contentValues.put(strArr[2], es1Var.c);
        contentValues.put(strArr[3], es1Var.d);
        try {
            String str = strArr[4];
            Object obj = es1Var.e;
            ObjectOutputStream objectOutputStream2 = null;
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                objectOutputStream.writeObject(obj);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    objectOutputStream.close();
                } catch (IOException unused) {
                }
                contentValues.put(str, byteArray);
                contentValues.put(strArr[5], Integer.valueOf(es1Var.f));
                contentValues.put(strArr[6], Integer.valueOf(es1Var.g));
                contentValues.put(strArr[7], Long.valueOf(es1Var.h));
                contentValues.put(strArr[8], Long.valueOf(es1Var.i));
                contentValues.put(strArr[9], Long.valueOf(es1Var.j));
                return contentValues;
            } catch (IOException e2) {
                e = e2;
                objectOutputStream2 = objectOutputStream;
                throw new NeneException("IOException when serializing", e);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (NeneException e3) {
            throw new NeneRuntimeException("Exception when serializing, " + es1Var.e, e3);
        }
    }

    public static es1 k(Cursor cursor) throws Throwable {
        Throwable th;
        Throwable th2;
        ObjectInputStream objectInputStream;
        int length = b.length;
        cursor.getColumnCount();
        int i = cursor.getInt(0);
        String string = cursor.getString(1);
        String string2 = cursor.getString(2);
        String string3 = cursor.getString(3);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(cursor.getBlob(4)));
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (IOException | ClassNotFoundException e) {
            th = e;
        }
        try {
            Object object = objectInputStream.readObject();
            try {
                objectInputStream.close();
            } catch (IOException unused) {
            }
            return new es1(i, string, string2, string3, object, cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
        } catch (IOException e2) {
            e = e2;
            th = e;
            throw new NeneException("Exception in deserialization", th);
        } catch (ClassNotFoundException e3) {
            e = e3;
            th = e;
            throw new NeneException("Exception in deserialization", th);
        } catch (Throwable th4) {
            th2 = th4;
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 == null) {
                throw th2;
            }
            try {
                objectInputStream2.close();
                throw th2;
            } catch (IOException unused2) {
                throw th2;
            }
        }
    }

    public void D(es1 es1Var) throws Throwable {
        ContentValues contentValuesG = g(es1Var);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.update("DownloadItem", contentValuesG, b[0] + "=?", new String[]{Integer.toString(es1Var.a)});
            writableDatabase.close();
        } catch (SQLiteFullException | Exception unused) {
        }
    }

    public void b() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.delete("DownloadItem", null, null);
        writableDatabase.close();
    }

    public void d(es1 es1Var) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete("DownloadItem", b[0] + "=?", new String[]{Integer.toString(es1Var.a)});
            writableDatabase.close();
        } catch (SQLiteFullException | Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.a = true;
        sQLiteDatabase.execSQL("CREATE TABLE DownloadItem(\"_id\" INTEGER PRIMARY KEY NOT NULL , \"sourceUrl\" TEXT , \"destFilePath\" TEXT , \"key\" TEXT , \"tag\" BLOB , \"status\" INTEGER NOT NULL , \"detailedStatus\" INTEGER NOT NULL , \"serverSize\" INTEGER NOT NULL , \"localSize\" INTEGER NOT NULL , \"timestamp\" INTEGER NOT NULL);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.a = true;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS DownloadItem");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.a = true;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS DownloadItem");
        onCreate(sQLiteDatabase);
    }

    public String toString() {
        return getClass().getSimpleName().concat(".toString(): This method implementation is commented because of poor performance. Uncomment the code to get whole database in a String.");
    }

    public List u() {
        Cursor cursorQuery = null;
        try {
            ArrayList arrayList = new ArrayList();
            cursorQuery = getReadableDatabase().query("DownloadItem", b, null, null, null, null, null);
            cursorQuery.moveToFirst();
            while (!cursorQuery.isAfterLast()) {
                arrayList.add(k(cursorQuery));
                cursorQuery.moveToNext();
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public void y(es1 es1Var) {
        try {
            es1Var.j = System.currentTimeMillis();
            ContentValues contentValuesG = g(es1Var);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.insert("DownloadItem", null, contentValuesG);
            writableDatabase.close();
        } catch (SQLiteFullException | Exception unused) {
        }
    }
}
