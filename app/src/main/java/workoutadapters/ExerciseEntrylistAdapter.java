package workoutadapters;

import android.content.Context;
import android.database.Cursor;
import android.widget.SimpleCursorAdapter;

import club.enhancedliving.enhancedliving.R;

import database.DBClass;

/**
 * Created by v-dafran on 12/03/2016.
 */
public class ExerciseEntrylistAdapter extends SimpleCursorAdapter {

    DBClass mDbmediator;

    ExerciseEntrylistAdapter( Context ctx, DBClass dbmediator ) {
        super(ctx , R.layout.autocomplete_entry, dbmediator.fetchExerciseNames( "" ), new String[] {DBClass.KEY_ID}, new int[] { android.R.id.text1 }, 0 );
        mDbmediator = dbmediator;

        SimpleCursorAdapter.CursorToStringConverter converter = new SimpleCursorAdapter.CursorToStringConverter() {

            @Override
            public CharSequence convertToString(Cursor cursor) {
                return cursor.getString( cursor.getColumnIndex(DBClass.KEY_ID)  );
            }
        };

        this.setCursorToStringConverter( converter );
    }

    @Override
    public Cursor runQueryOnBackgroundThread(CharSequence constraint) {
        String args = "";

        if (constraint != null)
        {
            args = constraint.toString();
        }
        return mDbmediator.fetchExerciseNames( args );
    }
}
