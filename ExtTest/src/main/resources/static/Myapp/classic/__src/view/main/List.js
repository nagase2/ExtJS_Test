/**
 * This view is an example list of people.
 */
Ext.define('Myapp.view.main.List', {
    extend: 'Ext.grid.Panel',
    //renderTo: 'nagase-div'
    xtype: 'mainlistxxx',

    requires: [
        'Myapp.store.Personnel'
    ],

    title: 'Personnel n',

    store: {
        type: 'personnel'
    },

    columns: [
        { text: 'Name',  dataIndex: 'name' },
        { text: 'Email', dataIndex: 'email', flex: 1 },
        { text: 'Phone', dataIndex: 'phone', flex: 1 }
    ],

    listeners: {
        select: 'onItemSelected'
    }
});
