A-1: for frontend:
cd to finespring
npm install -g @angular/cli


E:\home\EclipseW\TCTO\finespring>npm install -g @angular/cli
C:\Users\Alfred\AppData\Roaming\npm\ng -> C:\Users\Alfred\AppData\Roaming\npm\node_modules\@angular\cli\bin\ng
C:\Users\Alfred\AppData\Roaming\npm
`-- @angular/cli@1.0.2
  +-- autoprefixer@6.7.7
  | +-- browserslist@1.7.7
  | | `-- electron-to-chromium@1.3.9
  | `-- caniuse-db@1.0.30000665
  +-- html-webpack-plugin@2.28.0
  | `-- html-minifier@3.4.4
  +-- minimatch@3.0.4
  +-- node-sass@4.5.2
  | `-- npmlog@4.1.0
  +-- rxjs@5.3.1
  +-- silent-error@1.1.0
  +-- webpack@2.2.1
  | `-- uglify-js@2.8.23
  +-- webpack-dev-server@2.4.5
  | `-- sockjs-client@1.1.2
  |   `-- url-parse@1.1.9
  |     `-- querystringify@1.0.0
  `-- zone.js@0.8.10

npm WARN optional SKIPPING OPTIONAL DEPENDENCY: fsevents@^1.0.0 (node_modules\@angular\cli\node_modules\chokidar\node_modules\fsevents):
npm WARN notsup SKIPPING OPTIONAL DEPENDENCY: Unsupported platform for fsevents@1.1.1: wanted {"os":"darwin","arch":"any"} (current: {"os":"win32","arch":"x64"})


A-2: 
cd to frontend
mkdir src/master
cd src 
run "ng new --skip-git --directory frontend finespring"


E:\home\EclipseW\TCTO\finespring\frontend\src>ng new --skip-git --directory frontend findspring
installing ng
  create .editorconfig
  create README.md
  create src\app\app.component.css
  create src\app\app.component.html
  create src\app\app.component.spec.ts
  create src\app\app.component.ts
  create src\app\app.module.ts
  create src\assets\.gitkeep
  create src\environments\environment.prod.ts
  create src\environments\environment.ts
  create src\favicon.ico
  create src\index.html
  create src\main.ts
  create src\polyfills.ts
  create src\styles.css
  create src\test.ts
  create src\tsconfig.app.json
  create src\tsconfig.spec.json
  create src\typings.d.ts
  create .angular-cli.json
  create e2e\app.e2e-spec.ts
  create e2e\app.po.ts
  create e2e\tsconfig.e2e.json
  create karma.conf.js
  create package.json
  create protractor.conf.js
  create tsconfig.json
  create tslint.json
Installing packages for tooling via npm.
Installed packages for tooling via npm.
Project 'findspring' successfully created.

B-:
cd to frontend/src/frontend
npm run


E:\home\EclipseW\TCTO\finespring\frontend\src\frontend>npm start

> findspring@0.0.0 start E:\home\EclipseW\TCTO\finespring\frontend\src\frontend
> ng serve --proxy-config proxy.conf.json

** NG Live Development Server is running on http://localhost:4200 **
Hash: 07ba8a3f6234c6ad652e
Time: 10001ms
chunk    {0} polyfills.bundle.js, polyfills.bundle.js.map (polyfills) 157 kB {4} [initial] [rendered]
chunk    {1} styles.bundle.js, styles.bundle.js.map (styles) 65.2 kB {4} [initial] [rendered]
chunk    {2} main.bundle.js, main.bundle.js.map (main) 3.7 kB {3} [initial] [rendered]
chunk    {3} vendor.bundle.js, vendor.bundle.js.map (vendor) 2.45 MB [initial] [rendered]
chunk    {4} inline.bundle.js, inline.bundle.js.map (inline) 0 bytes [entry] [rendered]
webpack: Compiled successfully.



TEST: 
localhost:4200
display "app works!!"
