/*******************************************************************************
 * This file is part of RedReader.
 *
 * RedReader is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RedReader is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RedReader.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package org.quantumbadger.redreader.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public abstract class RRFragment {

	private final AppCompatActivity mParent;

	protected RRFragment(
			final AppCompatActivity parent,
			final Bundle savedInstanceState) {
		mParent = parent;
	}

	protected final Context getContext() {
		return mParent;
	}

	protected final AppCompatActivity getActivity() {
		return mParent;
	}

	protected final String getString(final int resource) {
		return mParent.getApplicationContext().getString(resource);
	}

	protected final void startActivity(final Intent intent) {
		mParent.startActivity(intent);
	}

	protected final void startActivityForResult(final Intent intent, final int requestCode) {
		mParent.startActivityForResult(intent, requestCode);
	}

	public void onCreateOptionsMenu(Menu menu) {}
	public boolean onOptionsItemSelected(MenuItem item) {return false;}

	public abstract View getView();

	public abstract Bundle onSaveInstanceState();
}
