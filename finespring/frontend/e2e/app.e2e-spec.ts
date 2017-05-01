import { FinespringPage } from './app.po';

describe('finespring App', () => {
  let page: FinespringPage;

  beforeEach(() => {
    page = new FinespringPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
