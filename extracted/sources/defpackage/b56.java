package defpackage;

import android.content.res.Resources;
import ir.mservices.market.data.permission.NotificationPermission;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionReason;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.data.permission.Quality;
import ir.mservices.market.data.permission.ReadStoragePermission;
import ir.mservices.market.data.permission.UsageStateServicePermission;
import ir.mservices.market.data.permission.WriteStoragePermission;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b56 {
    public static Permission a(Resources resources, int i, PermissionReasonId permissionReasonId, Quality quality) {
        PermissionReason permissionReasonC;
        if (permissionReasonId != PermissionReasonId.a) {
            permissionReasonC = c(resources, permissionReasonId);
        } else if (i == 1) {
            permissionReasonC = c(resources, PermissionReasonId.b);
        } else if (i == 2) {
            permissionReasonC = c(resources, PermissionReasonId.c);
        } else if (i == 3) {
            permissionReasonC = c(resources, PermissionReasonId.d);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException("id must be one of listed permissions");
            }
            permissionReasonC = c(resources, PermissionReasonId.g);
        }
        PermissionReason permissionReason = permissionReasonC;
        if (i == 1) {
            return new ReadStoragePermission(1, "android.permission.READ_EXTERNAL_STORAGE", permissionReason, quality, "android.permission-group.STORAGE");
        }
        if (i == 2) {
            return new WriteStoragePermission(2, "android.permission.WRITE_EXTERNAL_STORAGE", permissionReason, quality, "android.permission-group.STORAGE");
        }
        if (i == 3) {
            return new NotificationPermission(3, "android.permission.POST_NOTIFICATIONS", permissionReason, quality, "android.permission-group.NOTIFICATIONS");
        }
        if (i == 4) {
            return new UsageStateServicePermission(4, "android.permission.PACKAGE_USAGE_STATS", permissionReason, quality, "android.permission-group.STORAGE");
        }
        throw new IllegalArgumentException("id must be one of listed permissions");
    }

    public static String[] b(Permission[] permissionArr) {
        ArrayList arrayList = new ArrayList();
        for (Permission permission : permissionArr) {
            arrayList.add(permission.b);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static PermissionReason c(Resources resources, PermissionReasonId permissionReasonId) {
        switch (permissionReasonId.ordinal()) {
            case 0:
                throw new IllegalArgumentException("id must be one of listed reasons");
            case 1:
                return new PermissionReason(yq6.ic_access_permission, resources.getString(rs6.permission_title_read_storage), resources.getString(rs6.permission_description_read_storage));
            case 2:
                return new PermissionReason(yq6.ic_access_permission, resources.getString(rs6.permission_title_photo_read_storage), resources.getString(rs6.permission_description_photo_read_storage));
            case 3:
                return new PermissionReason(yq6.ic_access_permission, resources.getString(rs6.permission_title_write_storage), resources.getString(rs6.permission_description_write_storage));
            case 4:
                return new PermissionReason(resources.getString(rs6.notification_alert_title), true, resources.getString(rs6.notification_alert_description), resources.getString(rs6.notification_alert_button), "notification_action_update", AppStatusDto.Type.UPDATE, yq6.notification_icon, null);
            case 5:
                return new PermissionReason(resources.getString(rs6.notification_alert_title), true, resources.getString(rs6.notification_download_alert_description), resources.getString(rs6.access_txt_btn), "notification_action_download", "download", yq6.notification_icon, null);
            case 6:
                return new PermissionReason(resources.getString(rs6.notification_alert_title), true, resources.getString(rs6.notification_support_alert_description), resources.getString(rs6.notification_alert_button), "notification_action_support", "supprt", yq6.notification_icon, null);
            case 7:
                return new PermissionReason(yq6.ic_access_permission, resources.getString(rs6.usage_permission), resources.getString(rs6.permission_usage_description));
            case 8:
                return new PermissionReason(yq6.ic_access_permission, resources.getString(rs6.permission_title_movie_write_storage), resources.getString(rs6.permission_description_movie_write_storage));
            case 9:
                return new PermissionReason(yq6.ic_access_permission, resources.getString(rs6.permission_title_reel_write_storage), resources.getString(rs6.permission_description_reel_write_storage));
            default:
                throw new IllegalArgumentException("id must be one of listed reasons");
        }
    }
}
