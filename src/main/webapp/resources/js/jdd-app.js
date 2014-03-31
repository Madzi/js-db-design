/**
 * Приложение js-db-designer.
 *
 * @module JDD
 * @submodule JDD.App
 */
YUI.add('jdd-app', function (Y) {

    /**
     * Приложение js-db-designer.
     *
     * @class App
     * @namespace JDD
     * @extends App
     * @constructor
     */
    Y.namespace('JDD').App = Y.Base.create('jdd-app', Y.App, [], {
        /**
         * Страницы для отображения.
         *
         * @property view
         * @type Object
         */
        views: {
            home    : { type: 'JDD.Page.Home' },
            projects: { type: 'JDD.Page.Projects' }
        },

        initializer: function () {
            this.once('ready', function (event) {
                var path = this.getPath();
                if (this.hasRoute(path)) {
                    this.navigate(path);
                } else {
                    tihs.navigate('/');
                }
                this.dispatch();
            }, this);
        },

        showHome: function () {
            this.showView('home', {});
        },

        showProjects: function () {
            this.showView('projects', {});
        }
    }, {
        ATTRS: {
            /**
             * Адреса страниц.
             *
             * @attribute routes
             * @type Array
             */
            routes: {
                value: [
                    { path: '/',                callbacks: 'showHome' },
                    { path: '/projects/',       callbacks: 'showProjects' },
                    { path: '/project/:id/',    callbacks: 'showProject'}
                ]
            }
        }
    });

}, '1.0', {
    requires: [
        'app'
    ]
});