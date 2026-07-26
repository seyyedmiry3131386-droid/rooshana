package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: classes3.dex */
public final class vn5 extends ww3 {
    public static Long r0(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // defpackage.ww3, defpackage.tb2
    public final xj1 P(s26 s26Var) {
        s26 s26VarX;
        js3.p(s26Var, "path");
        Path pathF = s26Var.f();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathF, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathF) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = s26.b;
                s26VarX = rl3.x(symbolicLink.toString());
            } else {
                s26VarX = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lR0 = fileTimeCreationTime != null ? r0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lR02 = fileTimeLastModifiedTime != null ? r0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new xj1(zIsRegularFile, zIsDirectory, s26VarX, lValueOf, lR0, lR02, fileTimeLastAccessTime != null ? r0(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.ww3, defpackage.tb2
    public final void d(s26 s26Var, s26 s26Var2) throws IOException {
        js3.p(s26Var, "source");
        js3.p(s26Var2, "target");
        try {
            Files.move(s26Var.f(), s26Var2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.ww3
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
