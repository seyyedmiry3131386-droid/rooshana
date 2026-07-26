package io.sentry.android.sqlite;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements CrossProcessCursor {
    public final CrossProcessCursor a;
    public final a b;
    public final String c;
    public boolean d;

    public b(CrossProcessCursor crossProcessCursor, a aVar, String str) {
        js3.p(str, "sql");
        this.a = crossProcessCursor;
        this.b = aVar;
        this.c = str;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.a.copyStringToBuffer(i, charArrayBuffer);
    }

    @Override // android.database.Cursor
    public final void deactivate() {
        this.a.deactivate();
    }

    @Override // android.database.CrossProcessCursor
    public final void fillWindow(final int i, final CursorWindow cursorWindow) {
        if (this.d) {
            this.a.fillWindow(i, cursorWindow);
            return;
        }
        this.d = true;
        this.b.a(this.c, new bp2() { // from class: io.sentry.android.sqlite.SentryCrossProcessCursor$fillWindow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                this.g.a.fillWindow(i, cursorWindow);
                return tx8.a;
            }
        });
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i) {
        return this.a.getBlob(i);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.a.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.a.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.a.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        if (this.d) {
            return this.a.getCount();
        }
        this.d = true;
        return ((Number) this.b.a(this.c, new bp2() { // from class: io.sentry.android.sqlite.SentryCrossProcessCursor$getCount$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Integer.valueOf(this.g.a.getCount());
            }
        })).intValue();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.a.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.a.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.a.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        return this.a.getShort(i);
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        return this.a.getString(i);
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return this.a.getType(i);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.a.getWantsAllOnMoveCalls();
    }

    @Override // android.database.CrossProcessCursor
    public final CursorWindow getWindow() {
        return this.a.getWindow();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.a.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.a.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.a.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.a.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.a.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return this.a.move(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.a.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.a.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.a.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        return this.a.moveToPosition(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.a.moveToPrevious();
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(final int i, final int i2) {
        if (this.d) {
            return this.a.onMove(i, i2);
        }
        this.d = true;
        return ((Boolean) this.b.a(this.c, new bp2() { // from class: io.sentry.android.sqlite.SentryCrossProcessCursor$onMove$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.a.onMove(i, i2));
            }
        })).booleanValue();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.a.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        return this.a.requery();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.a.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.a.setNotificationUri(contentResolver, uri);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.a.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.unregisterDataSetObserver(dataSetObserver);
    }
}
